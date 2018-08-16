package com.hankkin.reading.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.hankkin.reading.domain.AccountBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ACCOUNT_BEAN".
*/
public class AccountBeanDao extends AbstractDao<AccountBean, Long> {

    public static final String TABLENAME = "ACCOUNT_BEAN";

    /**
     * Properties of entity AccountBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", true, "_id");
        public final static Property Icon = new Property(1, int.class, "icon", false, "ICON");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property Cate = new Property(3, String.class, "cate", false, "CATE");
        public final static Property Number = new Property(4, String.class, "number", false, "NUMBER");
        public final static Property Password = new Property(5, String.class, "password", false, "PASSWORD");
        public final static Property IsCollected = new Property(6, boolean.class, "isCollected", false, "IS_COLLECTED");
        public final static Property CreateAt = new Property(7, long.class, "createAt", false, "createAt");
        public final static Property UpdateAt = new Property(8, long.class, "updateAt", false, "updateAt");
        public final static Property Beizhu = new Property(9, String.class, "beizhu", false, "BEIZHU");
    }


    public AccountBeanDao(DaoConfig config) {
        super(config);
    }
    
    public AccountBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ACCOUNT_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: id
                "\"ICON\" INTEGER NOT NULL ," + // 1: icon
                "\"NAME\" TEXT," + // 2: name
                "\"CATE\" TEXT," + // 3: cate
                "\"NUMBER\" TEXT," + // 4: number
                "\"PASSWORD\" TEXT," + // 5: password
                "\"IS_COLLECTED\" INTEGER NOT NULL ," + // 6: isCollected
                "\"createAt\" INTEGER NOT NULL ," + // 7: createAt
                "\"updateAt\" INTEGER NOT NULL ," + // 8: updateAt
                "\"BEIZHU\" TEXT);"); // 9: beizhu
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ACCOUNT_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, AccountBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
        stmt.bindLong(2, entity.getIcon());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String cate = entity.getCate();
        if (cate != null) {
            stmt.bindString(4, cate);
        }
 
        String number = entity.getNumber();
        if (number != null) {
            stmt.bindString(5, number);
        }
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(6, password);
        }
        stmt.bindLong(7, entity.getIsCollected() ? 1L: 0L);
        stmt.bindLong(8, entity.getCreateAt());
        stmt.bindLong(9, entity.getUpdateAt());
 
        String beizhu = entity.getBeizhu();
        if (beizhu != null) {
            stmt.bindString(10, beizhu);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, AccountBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
        stmt.bindLong(2, entity.getIcon());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String cate = entity.getCate();
        if (cate != null) {
            stmt.bindString(4, cate);
        }
 
        String number = entity.getNumber();
        if (number != null) {
            stmt.bindString(5, number);
        }
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(6, password);
        }
        stmt.bindLong(7, entity.getIsCollected() ? 1L: 0L);
        stmt.bindLong(8, entity.getCreateAt());
        stmt.bindLong(9, entity.getUpdateAt());
 
        String beizhu = entity.getBeizhu();
        if (beizhu != null) {
            stmt.bindString(10, beizhu);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public AccountBean readEntity(Cursor cursor, int offset) {
        AccountBean entity = new AccountBean( //
            cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // icon
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // cate
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // number
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // password
            cursor.getShort(offset + 6) != 0, // isCollected
            cursor.getLong(offset + 7), // createAt
            cursor.getLong(offset + 8), // updateAt
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // beizhu
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, AccountBean entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setIcon(cursor.getInt(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setCate(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setNumber(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setPassword(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setIsCollected(cursor.getShort(offset + 6) != 0);
        entity.setCreateAt(cursor.getLong(offset + 7));
        entity.setUpdateAt(cursor.getLong(offset + 8));
        entity.setBeizhu(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(AccountBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(AccountBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(AccountBean entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}