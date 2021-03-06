package com.beer.macSim.member.model.service;

import com.beer.macSim.member.model.dao.MemberDao;
import com.beer.macSim.member.model.vo.Member;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberDao mDao;

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public Member loginMember(Member m) {
        return null;
    }

    @Override
    public int insertMember(Member m) {
    	return mDao.insertMember(sqlSession, m);
    }

    @Override
    public int updateMember(Member m) {
        return mDao.updateMember(sqlSession,m);
    }

    @Override
    public int deleteMember(String userPwd) {

        return mDao.deleteMember(sqlSession,userPwd);
    }
}
