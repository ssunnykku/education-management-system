package com.kosta.ems.scholarship;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;

@Mapper
public interface ScholarshipMapper {
    Collection<ScholarshipTargetDTO> selectScholarshipTargetList(@Param("name") String name, @Param("courseSeq") Long courseSeq, @Param("academyLocation") String academyLocation);
}
