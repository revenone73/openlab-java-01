package cn.openlab.game.dao;

import cn.openlab.game.entity.Member;

public interface MemberDao {

	Member getMemberByUserName(String userName);

	void updateMember(Member member);
}
