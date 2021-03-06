package utils;

import model.Classroom;
import model.ClassroomBag;
import model.RoomBuildings;

public class ClassroomFactory {
	
	private static String roomNumber;
	private static RoomBuildings roomBuilding;
	private static RoomBuildings[] roomBuildings = RoomBuildings.values();
	
	public static void emitClassrooms(ClassroomBag classroomBag) {
		for (int i=0; i<50; i++) {
			roomNumber = (int)(Math.random() * ((900 + 1) + 100)) + "";
			roomBuilding = roomBuildings[(int)(Math.random() * (roomBuildings.length))];
			
			Classroom classroom = new Classroom(roomNumber, roomBuilding);
			classroomBag.insert(classroom);

		}
	}
}
