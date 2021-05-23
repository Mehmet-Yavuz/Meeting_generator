package be.pxl.rp_backend.dto;

public class MeetingListDTO {
    private int page_count;
    private int page_number;
    private int page_size;
    private int total_records;
    private String next_page_token;
    private MeetingDTO[] meetings;

    public MeetingListDTO() {
    }

    public int getPage_count() {
        return page_count;
    }

    public void setPage_count(int page_count) {
        this.page_count = page_count;
    }

    public int getPage_number() {
        return page_number;
    }

    public void setPage_number(int page_number) {
        this.page_number = page_number;
    }

    public int getPage_size() {
        return page_size;
    }

    public void setPage_size(int page_size) {
        this.page_size = page_size;
    }

    public int getTotal_records() {
        return total_records;
    }

    public void setTotal_records(int total_records) {
        this.total_records = total_records;
    }

    public String getNext_page_token() {
        return next_page_token;
    }

    public void setNext_page_token(String next_page_token) {
        this.next_page_token = next_page_token;
    }

    public MeetingDTO[] getMeetings() {
        return meetings;
    }

    public void setMeetings(MeetingDTO[] meetings) {
        this.meetings = meetings;
    }
}
