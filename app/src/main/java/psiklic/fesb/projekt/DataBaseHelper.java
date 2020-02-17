package psiklic.fesb.projekt;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


    public class DataBaseHelper extends SQLiteOpenHelper {

        private static final int DATABASE_VER = 1;
        private static final String DATABASE_NAME = "Projekt.db";


    private static final String TABLE_NAME = "Person";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "Name";
    private static final String KEY_LAST_NAME = "Last_name";
    private static final String KEY_EMAIL = "Email";
    private static final String KEY_ADDRESS = "Address";
    private static final String KEY_PARENT_NAME = "Parent_name";
    private static final String KEY_CONTACT = "Contact";
    private static final String KEY_WEIGHT = "Weight";
    private static final String KEY_HEIGHT = "Height";
    private static final String KEY_CHECKBOX = "More_info";


    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VER);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
                + KEY_ID + " INTEGER PRIMARY KEY,"
                + KEY_NAME + " TEXT,"
                + KEY_LAST_NAME + " TEXT,"
                + KEY_EMAIL + " TEXT,"
                + KEY_ADDRESS + " TEXT,"
                + KEY_PARENT_NAME + " TEXT,"
                + KEY_CONTACT + " TEXT,"
                + KEY_WEIGHT + " INTEGER,"
                + KEY_HEIGHT + " INTEGER,"
                + KEY_CHECKBOX + " TEXT" + ")";
        sqLiteDatabase.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public void addPerson(Person person){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, person.getName());
        values.put(KEY_LAST_NAME, person.getLastName());
        values.put(KEY_EMAIL, person.getEmail());
        values.put(KEY_ADDRESS, person.getAddress());
        values.put(KEY_PARENT_NAME, person.getParent_name());
        values.put(KEY_CONTACT, person.getContact());
        values.put(KEY_WEIGHT, person.getWeight());
        values.put(KEY_HEIGHT, person.getHeight());
        values.put(KEY_CHECKBOX, person.getCheckbox());

        db.insert(TABLE_NAME, null, values);
        db.close();
    }


        public Cursor getAllData() {

            SQLiteDatabase db = this.getWritableDatabase();
            Cursor res = db.rawQuery("select * from " + TABLE_NAME, null);
            return res;
        }

}
