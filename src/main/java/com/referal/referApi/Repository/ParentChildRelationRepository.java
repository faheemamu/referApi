package com.referal.referApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.referal.referApi.Model.ParentChildRelation;
//import com.referal.referApi.Model.Referral;

@Repository
public interface ParentChildRelationRepository extends JpaRepository<ParentChildRelation, Long> {

}
