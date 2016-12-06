package com.dream.info.dao.ibatis;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.dream.info.dao.AlbumInfoDao;
import com.dreambox.core.dto.album.AlbumInfo;
import com.dreambox.core.utils.SQLUtils;
import com.ibatis.sqlmap.client.SqlMapClient;

/**
 * @author liuxinglong
 * @date 2016年12月6日
 */
@Repository("albumInfoDao")
public class AlbumInfoDaoImpl extends AlbumInfoDao {
    @Resource(name = "dream-info-sql-client")
    private SqlMapClient sqlMapClient;

    @Override
    public SqlMapClient getSqlMapClient() {
        return sqlMapClient;
    }
}
