package com.cic.base.mapper;

import com.cic.base.model.SpringJpaTestTable;
import java.util.List;

public interface SpringJpaTestTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_jpa_test_table
     *
     * @mbg.generated Wed Oct 18 22:22:33 CST 2017
     */
    int insert(SpringJpaTestTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_jpa_test_table
     *
     * @mbg.generated Wed Oct 18 22:22:33 CST 2017
     */
    List<SpringJpaTestTable> selectAll();
}