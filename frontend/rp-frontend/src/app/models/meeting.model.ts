export class Meeting{
    topic: string;
    agenda: string;
    start_time: string;
    duration: number;
    password: string;

    constructor(topic: string, agenda: string, start_time: string, duration: number, password: string) {
        this.topic = topic;
        this.agenda = agenda;
        this.start_time = start_time;
        this.duration = duration;
        this.password = password;
    }
}