package model;

public class ClassroomBag {
	private Classroom[] classroomArray;
	private int nElems = 0;
	
	public ClassroomBag (int maxSize) {
		classroomArray = new Classroom [maxSize];
	}

	public void insert(Classroom classroom) {
		classroomArray[nElems] = classroom;
		nElems++;
	}
	
	public Classroom delete(String roomNumber, RoomBuildings roomBuilding) {
		int i=-1;
		for (i=0; i<nElems; i++) {
			if (classroomArray[i].getRoomNumber().equals(roomNumber) && classroomArray[i].getRoomBuilding().equals(roomBuilding))
				break;
		}
		
		if (i == nElems)
			return null;
		else {
			Classroom temp = classroomArray[i];
			for (int j=i; j<nElems-1; j++) {
				classroomArray[j] = classroomArray[j+1];
			}
			nElems--;
			return temp;
		}
	}
	
	public Classroom search(String roomNumber, RoomBuildings roomBuilding) {
		for (int i=0; i<nElems; i++) {
			if (classroomArray[i].getRoomNumber().equals(roomNumber) && classroomArray[i].getRoomBuilding().equals(roomBuilding))
				return classroomArray[i];
		}
		return null;
	}
	
	public void display() {
		for (int i=0; i<nElems; i++) {
			System.out.println(classroomArray[i].toString());
		}
	}
}
