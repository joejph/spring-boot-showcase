package org.lina.boot.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="category")
public class Category {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.category_id
     *
     * @mbggenerated Tue May 31 17:27:56 CST 2016
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.category_name
     *
     * @mbggenerated Tue May 31 17:27:56 CST 2016
     */
    private String categoryName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.descriptions
     *
     * @mbggenerated Tue May 31 17:27:56 CST 2016
     */
    private String descriptions;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.parent_categroy_id
     *
     * @mbggenerated Tue May 31 17:27:56 CST 2016
     */
    private Long parentCategoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.path_Str
     *
     * @mbggenerated Tue May 31 17:27:56 CST 2016
     */
    private String pathStr;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.category_id
     *
     * @return the value of category.category_id
     *
     * @mbggenerated Tue May 31 17:27:56 CST 2016
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.category_id
     *
     * @param categoryId the value for category.category_id
     *
     * @mbggenerated Tue May 31 17:27:56 CST 2016
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.category_name
     *
     * @return the value of category.category_name
     *
     * @mbggenerated Tue May 31 17:27:56 CST 2016
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.category_name
     *
     * @param categoryName the value for category.category_name
     *
     * @mbggenerated Tue May 31 17:27:56 CST 2016
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.descriptions
     *
     * @return the value of category.descriptions
     *
     * @mbggenerated Tue May 31 17:27:56 CST 2016
     */
    public String getDescriptions() {
        return descriptions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.descriptions
     *
     * @param descriptions the value for category.descriptions
     *
     * @mbggenerated Tue May 31 17:27:56 CST 2016
     */
    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions == null ? null : descriptions.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.parent_categroy_id
     *
     * @return the value of category.parent_categroy_id
     *
     * @mbggenerated Tue May 31 17:27:56 CST 2016
     */
    public Long getParentCategoryId() {
        return parentCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.parent_categroy_id
     *
     * @param parentCategoryId the value for category.parent_categroy_id
     *
     * @mbggenerated Tue May 31 17:27:56 CST 2016
     */
    public void setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.path_Str
     *
     * @return the value of category.path_Str
     *
     * @mbggenerated Tue May 31 17:27:56 CST 2016
     */
    public String getPathStr() {
        return pathStr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.path_Str
     *
     * @param pathStr the value for category.path_Str
     *
     * @mbggenerated Tue May 31 17:27:56 CST 2016
     */
    public void setPathStr(String pathStr) {
        this.pathStr = pathStr == null ? null : pathStr.trim();
    }
}