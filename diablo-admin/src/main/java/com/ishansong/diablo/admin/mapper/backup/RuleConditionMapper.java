package com.ishansong.diablo.admin.mapper.backup;

import com.ishansong.diablo.admin.entity.RuleConditionDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("rollBackupRuleConditionMapper")
public interface RuleConditionMapper {

    List<RuleConditionDO> findByRuleIds(@Param("ruleIds") List<String> ruleIds);

    int deleteBatch(@Param("ruleIds") List<String> ruleIds);

    int insertBatch(@Param("ruleConditions") List<RuleConditionDO> ruleConditions);
}
