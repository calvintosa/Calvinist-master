package fryctze.tutorial.preference.data.factory;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import fryctze.tutorial.preference.data.BarangDAO;
import fryctze.tutorial.preference.model.Barang;

@Database(entities = {Barang.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract BarangDAO barangDAO();

}
