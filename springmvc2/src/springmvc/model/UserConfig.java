package springmvc.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


@XmlRootElement
public class UserConfig implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer userId;
    // google
    private String googleRelatedsClientId;
    private String googleRelatedsAdultClientId;
    private String googleAFDAdsClientId;
    private String googleAFSAdsClientId;
    private String googleChannelId;
    // yahoo
    private String yahooTag;
    // feed request params
    private Integer numAds;
    private Integer numRelateds;
    // for sale
    private String forSaleLink;
    private String forSaleText;

    private String googleAnalytics;

    public UserConfig(){}

    public UserConfig(Integer userId,
                      String googleRelatedsClientId,
                      String googleRelatedsAdultClientId,
                      String googleAFDAdsClientId,
                      String googleAFSAdsClientId,
                      String googleChannelId,
                      String yahooTag,
                      Integer numAds,
                      Integer numRelateds,
                      String forSaleLink,
                      String forSaleText,
                      String googleAnalytics
    ){
        this.userId = userId;
        this.googleRelatedsClientId = googleRelatedsClientId;
        this.googleRelatedsAdultClientId = googleRelatedsAdultClientId;
        this.googleAFDAdsClientId = googleAFDAdsClientId;
        this.googleAFSAdsClientId = googleAFSAdsClientId;
        this.googleChannelId = googleChannelId;
        this.yahooTag = yahooTag;
        this.numAds = numAds;
        this.numRelateds = numRelateds;
        this.forSaleLink = forSaleLink;
        this.forSaleText = forSaleText;
        this.googleAnalytics = googleAnalytics;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public String getGoogleRelatedsClientId() {
        return googleRelatedsClientId;
    }

    public void setGoogleRelatedsClientId(String googleRelatedsClientId) {
        this.googleRelatedsClientId = googleRelatedsClientId;
    }

     public String getGoogleRelatedsAdultClientId() {
        return googleRelatedsAdultClientId;
    }

    public void setGoogleRelatedsAdultClientId(String googleRelatedsAdultClientId) {
        this.googleRelatedsAdultClientId = googleRelatedsAdultClientId;
    }

     public String getGoogleAFDAdsClientId() {
        return googleAFDAdsClientId;
    }

    public void setGoogleAFDAdsClientId(String googleAFDAdsClientId) {
        this.googleAFDAdsClientId = googleAFDAdsClientId;
    }

    public String getGoogleAFSAdsClientId() {
        return googleAFSAdsClientId;
    }

    public void setGoogleAFSAdsClientId(String googleAFSAdsClientId) {
        this.googleAFSAdsClientId = googleAFSAdsClientId;
    }

    public String getGoogleChannelId() {
        return googleChannelId;
    }

    public void setGoogleChannelId(String googleChannelId) {
        this.googleChannelId = googleChannelId;
    }

    public String getYahooTag() {
        return yahooTag;
    }

    public void setYahooTag(String yahooTag) {
        this.yahooTag = yahooTag;
    }


    public Integer getNumAds() {
        return numAds;
    }

    public void setNumAds(Integer numAds) {
        this.numAds = numAds;
    }


    public Integer getNumRelateds() {
        return numRelateds;
    }

    public void setNumRelateds(Integer numRelateds) {
        this.numRelateds = numRelateds;
    }

      public String getForSaleLink() {
        return forSaleLink;
    }

    public void setForSaleLink(String forSaleLink) {
        this.forSaleLink = forSaleLink;
    }

    public String getForSaleText() {
        return forSaleText;
    }

    public void setForSaleText(String forSaleText) {
        this.forSaleText = forSaleText;
    }

    public String getGoogleAnalytics() {
        return googleAnalytics;
    }

    public void setGoogleAnalytics(String googleAnalytics) {
        this.googleAnalytics = googleAnalytics;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserConfig userConfig = (UserConfig) o;

        if (userId != null ? !userId.equals(userConfig.userId) : userConfig.userId != null) return false;
        if (googleRelatedsClientId != null ? !googleRelatedsClientId.equals(userConfig.googleRelatedsClientId) : userConfig.googleRelatedsClientId != null) return false;
        if (googleRelatedsAdultClientId != null ? !googleRelatedsAdultClientId.equals(userConfig.googleRelatedsAdultClientId) : userConfig.googleRelatedsAdultClientId != null) return false;
        if (googleAFDAdsClientId != null ? !googleAFDAdsClientId.equals(userConfig.googleAFDAdsClientId) : userConfig.googleAFDAdsClientId != null) return false;
        if (googleAFSAdsClientId != null ? !googleAFSAdsClientId.equals(userConfig.googleAFSAdsClientId) : userConfig.googleAFSAdsClientId != null) return false;
        if (googleChannelId != null ? !googleChannelId.equals(userConfig.googleChannelId) : userConfig.googleChannelId != null) return false;
        if (yahooTag != null ? !yahooTag.equals(userConfig.yahooTag) : userConfig.yahooTag != null) return false;
        if (numAds != null ? !numAds.equals(userConfig.numAds) : userConfig.numAds != null) return false;
        if (numRelateds != null ? !numRelateds.equals(userConfig.numRelateds) : userConfig.numRelateds != null) return false;
        if (forSaleLink != null ? !forSaleLink.equals(userConfig.googleAFSAdsClientId) : userConfig.forSaleLink != null) return false;
        if (forSaleText != null ? !forSaleText.equals(userConfig.forSaleText) : userConfig.forSaleText != null) return false;
        if (googleAnalytics != null ? !googleAnalytics.equals(userConfig.googleAnalytics) : userConfig.googleAnalytics != null) return false;


        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (googleRelatedsClientId != null ? googleRelatedsClientId.hashCode() : 0);
        result = 31 * result + (googleRelatedsAdultClientId != null ? googleRelatedsAdultClientId.hashCode() : 0);
        result = 31 * result + (googleAFDAdsClientId != null ? googleAFDAdsClientId.hashCode() : 0);
        result = 31 * result + (googleAFSAdsClientId != null ? googleAFSAdsClientId.hashCode() : 0);
        result = 31 * result + (googleChannelId != null ? googleChannelId.hashCode() : 0);
        result = 31 * result + (yahooTag != null ? yahooTag.hashCode() : 0);
        result = 31 * result + (numAds != null ? numAds.hashCode() : 0);
        result = 31 * result + (numRelateds != null ? numRelateds.hashCode() : 0);
        result = 31 * result + (forSaleLink != null ? forSaleLink.hashCode() : 0);
        result = 31 * result + (forSaleText != null ? forSaleText.hashCode() : 0);
        result = 31 * result + (googleAnalytics != null ? googleAnalytics.hashCode() : 0);

        return result;
    }

    public String toString() {
        final String TAB = "    ";

	    StringBuilder retValue = new StringBuilder();

	    retValue.append("UserConfig ( ")
	        .append("userId = ").append(this.userId).append(TAB)
	        .append("googleRelatedsClientId = ").append(this.googleRelatedsClientId).append(TAB)
            .append("googleRelatedsAdultClientId = ").append(this.googleRelatedsAdultClientId).append(TAB)
            .append("googleAFDAdsClientId = ").append(this.googleAFDAdsClientId).append(TAB)
            .append("googleAFSAdsClientId = ").append(this.googleAFSAdsClientId).append(TAB)
	        .append("googleChannelId = ").append(this.googleChannelId).append(TAB)
            .append("yahooTag = ").append(this.yahooTag).append(TAB)
	        .append("adNum = ").append(this.numAds).append(TAB)
            .append("adNum = ").append(this.numRelateds).append(TAB)
            .append("forSaleLink = ").append(this.forSaleLink).append(TAB)
            .append("forSaleText = ").append(this.forSaleText).append(TAB)
            .append("googleAnalytics = ").append(this.googleAnalytics).append(TAB)
	        .append(" )");

	    return retValue.toString();
    }
}
