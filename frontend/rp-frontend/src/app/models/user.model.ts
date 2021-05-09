export interface User{
        id: string;
        first_name: string;
        last_name: string;
        email: string;
        type: number;
        role_name: string;
        pmi: number;
        use_pmi: boolean;
        timezone: string;
        dept: string;
        created_at: Date;
        last_login_time: Date;
        last_client_version?: any;
        language: string;
        phone_country: string;
        phone_number: string;
        phone_numbers?: any;
        vanity_url?: any;
        personal_meeting_url: string;
        verified: number;
        pic_url?: any;
        cms_user_id: string;
        account_id: string;
        host_key: string;
        status: string;
        group_ids: any[];
        im_group_ids: any[];
        jid: string;
        job_title: string;
        company?: any;
        location: string;
        custom_attributes?: any;
        login_type: number;
        role_id: string;
        plan_united_type?: any;
        manager?: any;
}