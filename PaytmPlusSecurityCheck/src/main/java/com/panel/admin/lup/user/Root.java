package com.panel.admin.lup.user;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

class CurrentAddress{
    public String pincode;
}
class Date{
    public String $numberLong;
}
class EmploymentDetails{
    public String employmentType;
    public String monthlyIncome;
}
class LenderInformation{
    public String applicationId;
    public String customerId;
}
class Offer{
    public String loanAmount;
    public String disbursedAmount;
    public String roi;
    public String roiUnit;
    public String processingFeeRate;
    public String tenure;
    public String tenureUnit;
    public String repaymentAmount;
    public String installmentAmount;
    public String installmentFrequency;
}
class UpdatedAt{
    public Date $date;
}
class WhitelistOffer{
    public String baseId;
    public String offerId;
}
class TncDetail{
    public String type;
    public String setName;
    public String version;
    public boolean isAccepted;
    public String acceptedTime;
}

@Document("user")
@Data
public class Root{
    @Id
    public String _id;
    public String customerId;
    public String productType;
    public String productSubType;
    public String lenderId;
    public String email;
    public String mobile;
    public String pan;
    public String panName;
    public String dob;
    public String gender;
    public EmploymentDetails employmentDetails;
    public CurrentAddress currentAddress;
    public ArrayList<TncDetail> tncDetails;
    public Offer offer;
    public WhitelistOffer whitelistOffer;
    public LenderInformation lenderInformation;
    public UpdatedAt updatedAt;
    public String _class;

    public Root(String _id, String customerId, String productType, String productSubType, String lenderId,
                String email, String mobile, String pan, String panName, String dob, String gender,
                EmploymentDetails employmentDetails, CurrentAddress currentAddress, ArrayList<TncDetail> tncDetails,
                Offer offer, WhitelistOffer whitelistOffer, LenderInformation lenderInformation, UpdatedAt updatedAt,
                String _class) {
        super();
        this._id = _id;
        this.customerId = customerId;
        this.productType = productType;
        this.productSubType = productSubType;
        this.lenderId = lenderId;
        this.email = email;
        this.mobile = mobile;
        this.pan = pan;
        this.panName = panName;
        this.dob = dob;
        this.gender = gender;
        this.employmentDetails = employmentDetails;
        this.currentAddress = currentAddress;
        this.tncDetails = tncDetails;
        this.offer = offer;
        this.whitelistOffer = whitelistOffer;
        this.lenderInformation = lenderInformation;
        this.updatedAt = updatedAt;
        this._class = _class;
    }
}


