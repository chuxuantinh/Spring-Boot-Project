package com.cg.dao;

import com.cg.entity.Guest;

public interface GuestDAO {

	public void registerGuest(Guest guest);

	public void loginGuest(Guest guest);

}
