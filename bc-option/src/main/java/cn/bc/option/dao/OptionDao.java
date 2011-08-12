package cn.bc.option.dao;

import java.util.List;
import java.util.Map;

import cn.bc.option.domain.OptionGroup;
import cn.bc.option.domain.OptionItem;

/**
 * 选项Dao接口
 * 
 * @author dragon
 * 
 */
public interface OptionDao {
	/**
	 * 获取已配置的分类列表
	 * 
	 * @return
	 */
	List<OptionGroup> findOptionGroup();

	/**
	 * 查找指定分类的选项条目列表
	 * 
	 * @param optionGroupValue
	 *            所属分类，对应OptionGroup属性value的值
	 * @return
	 */
	List<OptionItem> findOptionItemByGroupValue(String optionGroupValue);

	/**
	 * 查找指定分类的选项条目列表
	 * 
	 * @param optionGroupValues
	 *            所属分类，对应OptionGroup属性value的值
	 * @return 返回结果的key为对应的OptionGroup的Key值，value为对应该key的OptionItem的列表
	 */
	Map<String, List<OptionItem>> findOptionItemByGroupValues(
			String[] optionGroupValues);
	/**
	 * 查找指定分类的选项条目列表
	 * 
	 * @param optionGroupValue
	 *            所属分类，对应OptionGroup属性key的值
	 * @return
	 */
	List<OptionItem> findOptionItemByGroupKey(String optionGroupKey);

	/**
	 * 查找指定分类的选项条目列表
	 * 
	 * @param optionGroupKeys
	 *            所属分类，对应OptionGroup属性Key的值
	 * @return 返回结果的key为对应的OptionGroup的Key值，value为对应该key的OptionItem的列表
	 */
	Map<String, List<OptionItem>> findOptionItemByGroupKeys(
			String[] optionGroupKeys);
}