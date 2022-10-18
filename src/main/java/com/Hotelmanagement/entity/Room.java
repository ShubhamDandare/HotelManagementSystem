package com.Hotelmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.Hotelmanagement.enumm.RoomStatus;
import com.Hotelmanagement.enumm.RoomType;

import lombok.Data;

@Entity
@Data
@Table
public class Room extends CommonClass {

	private Long hotelId;

	@Enumerated(EnumType.STRING)
	private RoomType roomtype;

	@Enumerated(EnumType.STRING)
	private RoomStatus roomstatus;
	
	public Room(Long id, Long hotelId, RoomType roomtype, RoomStatus roomstatus) {
		super(id);
		this.hotelId = hotelId;
		this.roomtype = roomtype;
		this.roomstatus = roomstatus;
	}

	@Override
	public String toString() {
		return "Room [hotelId=" + hotelId + ", roomtype=" + roomtype + ", roomstatus=" + roomstatus + "]";
	}

	public Long getHotelId() {
		return hotelId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public RoomType getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(RoomType roomtype) {
		this.roomtype = roomtype;
	}

	public RoomStatus getRoomstatus() {
		return roomstatus;
	}

	public void setRoomstatus(RoomStatus roomstatus) {
		this.roomstatus = roomstatus;
	}

	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Room(Long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

}
