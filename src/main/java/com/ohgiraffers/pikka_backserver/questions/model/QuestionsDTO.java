package com.ohgiraffers.pikka_backserver.questions.model;

public class QuestionsDTO {
    private Integer contactId;
    private Integer userId;
    private String userName;
    private String userTitle;
    private String contactType;
    private String contactContents;
    private String contactPostedDate;
    private Integer adminId;
    private String adminName;
    private String responseTitle;
    private String responseContents;
    private String responsePostedDate;
    private String responseStatus;
    private String answerContent;

    // 기본 생성자
    public QuestionsDTO() {}

    // 모든 필드를 포함한 생성자
    public QuestionsDTO(Integer contactId, Integer userId, String userName, String userTitle,
                        String contactType, String contactContents, String contactPostedDate,
                        Integer adminId, String adminName, String responseTitle,
                        String responseContents, String responsePostedDate,
                        String responseStatus, String answerContent) {
        this.contactId = contactId;
        this.userId = userId;
        this.userName = userName;
        this.userTitle = userTitle;
        this.contactType = contactType;
        this.contactContents = contactContents;
        this.contactPostedDate = contactPostedDate;
        this.adminId = adminId;
        this.adminName = adminName;
        this.responseTitle = responseTitle;
        this.responseContents = responseContents;
        this.responsePostedDate = responsePostedDate;
        this.responseStatus = responseStatus;
        this.answerContent = answerContent;
    }

    // Getter와 Setter 메소드들
    public Integer getContactId() { return contactId; }
    public void setContactId(Integer contactId) { this.contactId = contactId; }

    public Integer getUserId() { return userId; }
    public void setUserId(Integer userId) { this.userId = userId; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public String getUserTitle() { return userTitle; }
    public void setUserTitle(String userTitle) { this.userTitle = userTitle; }

    public String getContactType() { return contactType; }
    public void setContactType(String contactType) { this.contactType = contactType; }

    public String getContactContents() { return contactContents; }
    public void setContactContents(String contactContents) { this.contactContents = contactContents; }

    public String getContactPostedDate() { return contactPostedDate; }
    public void setContactPostedDate(String contactPostedDate) { this.contactPostedDate = contactPostedDate; }

    public Integer getAdminId() { return adminId; }
    public void setAdminId(Integer adminId) { this.adminId = adminId; }

    public String getAdminName() { return adminName; }
    public void setAdminName(String adminName) { this.adminName = adminName; }

    public String getResponseTitle() { return responseTitle; }
    public void setResponseTitle(String responseTitle) { this.responseTitle = responseTitle; }

    public String getResponseContents() { return responseContents; }
    public void setResponseContents(String responseContents) { this.responseContents = responseContents; }

    public String getResponsePostedDate() { return responsePostedDate; }
    public void setResponsePostedDate(String responsePostedDate) { this.responsePostedDate = responsePostedDate; }

    public String getResponseStatus() { return responseStatus; }
    public void setResponseStatus(String responseStatus) { this.responseStatus = responseStatus; }

    public String getAnswerContent() { return answerContent; }
    public void setAnswerContent(String answerContent) { this.answerContent = answerContent; }

    @Override
    public String toString() {
        return "QuestionsDTO{" +
                "contactId=" + contactId +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userTitle='" + userTitle + '\'' +
                ", contactType='" + contactType + '\'' +
                ", contactContents='" + contactContents + '\'' +
                ", contactPostedDate='" + contactPostedDate + '\'' +
                ", adminId=" + adminId +
                ", adminName='" + adminName + '\'' +
                ", responseTitle='" + responseTitle + '\'' +
                ", responseContents='" + responseContents + '\'' +
                ", responsePostedDate='" + responsePostedDate + '\'' +
                ", responseStatus='" + responseStatus + '\'' +
                ", answerContent='" + answerContent + '\'' +
                '}';
    }
}