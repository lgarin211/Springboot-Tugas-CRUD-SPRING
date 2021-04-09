package com.example12.demo1221.Service;

import com.example12.demo1221.Repository.REPO_DAPODIK;
import com.example12.demo1221.migration.MIG_Dapodik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SER_Dapodik {
    private final REPO_DAPODIK repo_dapodik;
    @Autowired
    public SER_Dapodik(REPO_DAPODIK repo_dapodik) {
        this.repo_dapodik = repo_dapodik;
    }

    public List<MIG_Dapodik> AllSiswa(){
        return repo_dapodik.findAll();
    }

    public void newDapodik(MIG_Dapodik callsa){
        repo_dapodik.save(callsa);
    }


}
