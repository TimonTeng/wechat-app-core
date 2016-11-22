package com.d.t.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.d.t.model.db.TSysUser;


public interface ISysUserRepository extends JpaRepository<TSysUser, Integer> {
	
	/**
	 * 使用JPA执行原生sql查询
	 * @return
	 */
	@Query(value = "select * from t_sys_user", nativeQuery = true)
	public List<TSysUser> nativeQueryList();
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@Query(value = "select u from TSysUser u where u.id=:id")
	public TSysUser findById(@Param("id")Integer id);

}
