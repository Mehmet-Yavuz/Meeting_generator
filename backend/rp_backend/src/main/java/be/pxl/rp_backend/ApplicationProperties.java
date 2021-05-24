package be.pxl.rp_backend;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app")
public class ApplicationProperties {
    private String clientId;
    private String clientSecret;
    private String redirectUrl;
    private String zoomBaseUrl;
    private String zoomOauthPath;
    private String zoomUserPath;
    private String zoomMeetingPath;

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public String getZoomBaseUrl() {
        return zoomBaseUrl;
    }

    public String getZoomOauthPath() {
        return zoomOauthPath;
    }

    public String getZoomUserPath() {
        return zoomUserPath;
    }

    public String getZoomMeetingPath() {
        return zoomMeetingPath;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public void setZoomBaseUrl(String zoomBaseUrl) {
        this.zoomBaseUrl = zoomBaseUrl;
    }

    public void setZoomOauthPath(String zoomOauthPath) {
        this.zoomOauthPath = zoomOauthPath;
    }

    public void setZoomUserPath(String zoomUserPath) {
        this.zoomUserPath = zoomUserPath;
    }

    public void setZoomMeetingPath(String zoomMeetingPath) {
        this.zoomMeetingPath = zoomMeetingPath;
    }
}
