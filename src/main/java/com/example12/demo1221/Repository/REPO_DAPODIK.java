package com.example12.demo1221.Repository;

import com.example12.demo1221.migration.MIG_Dapodik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REPO_DAPODIK extends JpaRepository<MIG_Dapodik,String> {
}
