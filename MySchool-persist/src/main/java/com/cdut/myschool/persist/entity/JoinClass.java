package com.cdut.myschool.persist.entity;

import java.util.Date;

public class JoinClass {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column join_class.user_id
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column join_class.study_id
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    private String studyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column join_class.time
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    private Date time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column join_class.user_id
     *
     * @return the value of join_class.user_id
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column join_class.user_id
     *
     * @param userId the value for join_class.user_id
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column join_class.study_id
     *
     * @return the value of join_class.study_id
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    public String getStudyId() {
        return studyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column join_class.study_id
     *
     * @param studyId the value for join_class.study_id
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    public void setStudyId(String studyId) {
        this.studyId = studyId == null ? null : studyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column join_class.time
     *
     * @return the value of join_class.time
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column join_class.time
     *
     * @param time the value for join_class.time
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    public void setTime(Date time) {
        this.time = time;
    }
}