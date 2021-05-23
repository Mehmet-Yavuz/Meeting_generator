package be.pxl.rp_backend.dto;


public class MeetingDTO {

    private String uuid;
    private long id;
    private String host_id;
    private String assistant_id;
    private String host_email;
    private String topic;
    private int type;
    private String status;
    private String start_time;
    private int duration;
    private String timezone;
    private String created_at;
    private String agenda;
    private String start_url;
    private String join_url;
    private String password;
    private String h323_password;
    private String encrypted_password;
    private long pmi;
    private Object[] tracking_fields;
    private Object[] occurrences;
    private Object setting;
    private Object recurrence;

    public MeetingDTO() {
        //empty constructor
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHost_id() {
        return host_id;
    }

    public void setHost_id(String host_id) {
        this.host_id = host_id;
    }

    public String getAssistant_id() {
        return assistant_id;
    }

    public void setAssistant_id(String assistant_id) {
        this.assistant_id = assistant_id;
    }

    public String getHost_email() {
        return host_email;
    }

    public void setHost_email(String host_email) {
        this.host_email = host_email;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    public String getStart_url() {
        return start_url;
    }

    public void setStart_url(String start_url) {
        this.start_url = start_url;
    }

    public String getJoin_url() {
        return join_url;
    }

    public void setJoin_url(String join_url) {
        this.join_url = join_url;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getH323_password() {
        return h323_password;
    }

    public void setH323_password(String h323_password) {
        this.h323_password = h323_password;
    }

    public String getEncrypted_password() {
        return encrypted_password;
    }

    public void setEncrypted_password(String encrypted_password) {
        this.encrypted_password = encrypted_password;
    }

    public long getPmi() {
        return pmi;
    }

    public void setPmi(long pmi) {
        this.pmi = pmi;
    }

    public Object[] getTracking_fields() {
        return tracking_fields;
    }

    public void setTracking_fields(Object[] tracking_fields) {
        this.tracking_fields = tracking_fields;
    }

    public Object[] getOccurrences() {
        return occurrences;
    }

    public void setOccurrences(Object[] occurrences) {
        this.occurrences = occurrences;
    }

    public Object getSetting() {
        return setting;
    }

    public void setSetting(Object setting) {
        this.setting = setting;
    }

    public Object getRecurrence() {
        return recurrence;
    }

    public void setRecurrence(Object recurrence) {
        this.recurrence = recurrence;
    }
}
