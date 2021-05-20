package be.pxl.rp_backend.dto;

public class UserDTO {

    private String id;
    private String first_name;
    private String last_name;
    private String email;
    private int type;
    private String role_name;
    private long pmi;
    private boolean use_pmi;
    private String timezone;
    private String dept;
    private String created_at;
    private String last_login_time;
    private String last_client_version;
    private String language;
    private String phone_country;
    private String phone_number;
    private Object phone_numbers;
    private String vanity_url;
    private String personal_meeting_url;
    private int verified;
    private String pic_url;
    private String cms_user_id;
    private String account_id;
    private String host_key;
    private String status;
    private String[] group_ids;
    private String[] im_group_ids;
    private String jid;
    private String job_title;
    private String company;
    private String location;
    private Object custom_attributes;
    private int login_type;
    private String role_id;
    private String plan_united_type;
    private String manager;

    public UserDTO() {
        //empty constructor
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public long getPmi() {
        return pmi;
    }

    public void setPmi(long pmi) {
        this.pmi = pmi;
    }

    public boolean isUse_pmi() {
        return use_pmi;
    }

    public void setUse_pmi(boolean use_pmi) {
        this.use_pmi = use_pmi;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getLast_login_time() {
        return last_login_time;
    }

    public void setLast_login_time(String last_login_time) {
        this.last_login_time = last_login_time;
    }

    public String getLast_client_version() {
        return last_client_version;
    }

    public void setLast_client_version(String last_client_version) {
        this.last_client_version = last_client_version;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPhone_country() {
        return phone_country;
    }

    public void setPhone_country(String phone_country) {
        this.phone_country = phone_country;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Object getPhone_numbers() {
        return phone_numbers;
    }

    public void setPhone_numbers(Object phone_numbers) {
        this.phone_numbers = phone_numbers;
    }

    public String getVanity_url() {
        return vanity_url;
    }

    public void setVanity_url(String vanity_url) {
        this.vanity_url = vanity_url;
    }

    public String getPersonal_meeting_url() {
        return personal_meeting_url;
    }

    public void setPersonal_meeting_url(String personal_meeting_url) {
        this.personal_meeting_url = personal_meeting_url;
    }

    public int getVerified() {
        return verified;
    }

    public void setVerified(int verified) {
        this.verified = verified;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public String getCms_user_id() {
        return cms_user_id;
    }

    public void setCms_user_id(String cms_user_id) {
        this.cms_user_id = cms_user_id;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getHost_key() {
        return host_key;
    }

    public void setHost_key(String host_key) {
        this.host_key = host_key;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getGroup_ids() {
        return group_ids;
    }

    public void setGroup_ids(String[] group_ids) {
        this.group_ids = group_ids;
    }

    public String[] getIm_group_ids() {
        return im_group_ids;
    }

    public void setIm_group_ids(String[] im_group_ids) {
        this.im_group_ids = im_group_ids;
    }

    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Object getCustom_attributes() {
        return custom_attributes;
    }

    public void setCustom_attributes(Object custom_attributes) {
        this.custom_attributes = custom_attributes;
    }

    public int getLogin_type() {
        return login_type;
    }

    public void setLogin_type(int login_type) {
        this.login_type = login_type;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getPlan_united_type() {
        return plan_united_type;
    }

    public void setPlan_united_type(String plan_united_type) {
        this.plan_united_type = plan_united_type;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
