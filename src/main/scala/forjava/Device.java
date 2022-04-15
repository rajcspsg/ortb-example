package forjava;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({"ua", "dnt", "ip", "devicetype"})
public class Device implements Serializable {
    @JsonProperty("ua")
    private String ua;
    @JsonProperty("dnt")
    private Integer dnt;
    @JsonProperty("ip")
    private String ip;
    @JsonProperty("devicetype")
    private Integer devicetype;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    private static final long serialVersionUID = -4938649324295079141L;

    public Device() {
    }

    public Device(String ua, Integer dnt, Integer lmt, String ip, String ipv6, Integer devicetype, String make) {
        this.ua = ua;
        this.dnt = dnt;
        this.ip = ip;
        this.devicetype = devicetype;
    }

    @JsonProperty("ua")
    public String getUa() {
        return this.ua;
    }

    @JsonProperty("ua")
    public void setUa(String ua) {
        this.ua = ua;
    }

    @JsonProperty("dnt")
    public Integer getDnt() {
        return this.dnt;
    }

    @JsonProperty("dnt")
    public void setDnt(Integer dnt) {
        this.dnt = dnt;
    }

    @JsonProperty("ip")
    public String getIp() {
        return this.ip;
    }

    @JsonProperty("ip")
    public void setIp(String ip) {
        this.ip = ip;
    }

    @JsonProperty("devicetype")
    public Integer getDevicetype() {
        return this.devicetype;
    }

    @JsonProperty("devicetype")
    public void setDevicetype(Integer devicetype) {
        this.devicetype = devicetype;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Device.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ua");
        sb.append('=');
        sb.append(this.ua == null ? "<null>" : this.ua);
        sb.append(',');
        sb.append("dnt");
        sb.append('=');
        sb.append(this.dnt == null ? "<null>" : this.dnt);
        sb.append(',');
        sb.append("ip");
        sb.append('=');
        sb.append(this.ip == null ? "<null>" : this.ip);
        sb.append(',');
        sb.append("devicetype");
        sb.append('=');
        sb.append(this.devicetype == null ? "<null>" : this.devicetype);
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(this.additionalProperties == null ? "<null>" : this.additionalProperties);
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public int hashCode() {
        int result = 1;

        result = result * 31 + (this.ua == null ? 0 : this.ua.hashCode());
        result = result * 31 + (this.devicetype == null ? 0 : this.devicetype.hashCode());
        result = result * 31 + (this.ip == null ? 0 : this.ip.hashCode());
        result = result * 31 + (this.dnt == null ? 0 : this.dnt.hashCode());
        return result;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        } else if (!(other instanceof Device)) {
            return false;
        } else {
            Device rhs = (Device)other;
            return (Objects.equals(this.ua, rhs.ua))
                    && (Objects.equals(this.devicetype, rhs.devicetype) || this.devicetype != null
                    && this.devicetype.equals(rhs.devicetype))
                    && (Objects.equals(this.ip, rhs.ip))
                    && (Objects.equals(this.dnt, rhs.dnt)) ;
        }
    }
}