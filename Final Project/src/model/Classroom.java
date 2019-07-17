package model;

public class Classroom {
	private String roomNumber;
	private RoomBuildings roomBuilding;
	
	public Classroom(String roomNumber, RoomBuildings roomBuilding) {
		super();
		this.roomNumber = roomNumber;
		this.roomBuilding = roomBuilding;
	}
	
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public RoomBuildings getRoomBuilding() {
		return roomBuilding;
	}
	public void setRoomBuilding(RoomBuildings roomBuilding) {
		this.roomBuilding = roomBuilding;
	}
	
	@Override
	public String toString() {
		return "Classroom: roomNumber=" + roomNumber + ", roomBuilding=" + roomBuilding;
	}
}
