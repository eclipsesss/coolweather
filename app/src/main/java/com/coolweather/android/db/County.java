package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 王 on 2018/6/29.
 */

public class County extends DataSupport {
    private String countyName;
    private int countyId;
    private int cityId;
    private String weatherId;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getCountyId() {
        return countyId;
    }

    public void setCountyId(int countyId) {
        this.countyId = countyId;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getWeatherId() {
        return weatherId;
    }
}
