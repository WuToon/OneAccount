package com.loubii.account.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.loubii.account.bean.AccountModel;

import com.loubii.account.db.AccountModelDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig accountModelDaoConfig;

    private final AccountModelDao accountModelDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        accountModelDaoConfig = daoConfigMap.get(AccountModelDao.class).clone();
        accountModelDaoConfig.initIdentityScope(type);

        accountModelDao = new AccountModelDao(accountModelDaoConfig, this);

        registerDao(AccountModel.class, accountModelDao);
    }
    
    public void clear() {
        accountModelDaoConfig.clearIdentityScope();
    }

    public AccountModelDao getAccountModelDao() {
        return accountModelDao;
    }

}
