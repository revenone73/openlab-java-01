package cn.openlab.game.dao;

import cn.openlab.game.entity.MemberResource;

public interface MemberResourceDao {

	void save(MemberResource resource);
	
	void update(MemberResource resource);
	
	MemberResource getMemberResourceByMemberId(Integer id);
}
