package org.keycloak.models;

import java.util.Map;

/**
 * Specifies a mapping from user data to a protocol claim assertion.  If protocolMapper is set, this points
 * to a @Provider that will perform the mapping.  If you have this set, then no other attributes of this class need to be set.
 * If you don't have it set, then this is a simple one to one mapping between the protocolClaim and the sourceAttribute.
 * SourceAttribute is the user data, protocolClaim is the name of the data you want to store in the protocols document or token.
 *
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public class ProtocolMapperModel {
    protected String id;
    protected String name;
    protected String protocol;
    protected String protocolMapper;
    protected boolean consentRequired;
    protected String consentText;
    protected boolean appliedByDefault;
    protected Map<String, String> config;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public boolean isAppliedByDefault() {
        return appliedByDefault;
    }

    public void setAppliedByDefault(boolean appliedByDefault) {
        this.appliedByDefault = appliedByDefault;
    }

    public String getProtocolMapper() {
        return protocolMapper;
    }

    public void setProtocolMapper(String protocolMapper) {
        this.protocolMapper = protocolMapper;
    }

    public boolean isConsentRequired() {
        return consentRequired;
    }

    public void setConsentRequired(boolean consentRequired) {
        this.consentRequired = consentRequired;
    }

    public String getConsentText() {
        return consentText;
    }

    public void setConsentText(String consentText) {
        this.consentText = consentText;
    }

    public Map<String, String> getConfig() {
        return config;
    }

    public void setConfig(Map<String, String> config) {
        this.config = config;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProtocolMapperModel that = (ProtocolMapperModel) o;

        if (!id.equals(that.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
