package com.rest_api.rest_api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Device {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String device;
    @JsonProperty("deviceModel")
    private String device_model;
    @JsonProperty("gmtCreate")
    private String gmt_create;
    @JsonProperty("gmtUpdate")
    private String gmt_update;
    private double lat;
    private double lng;
    @JsonProperty("activateTime")
    private int activate_time;
    @JsonProperty("romModel")
    private String rom_model;
    @JsonProperty("aliveTime")
    private int alive_time;
    @JsonProperty("bindingTime")
    private int binding_time;
    private int is_debug;
    @JsonProperty("romVersionName")
    private String rom_version_name;
    @JsonProperty("romVersionCode")
    private String rom_version_code;
    private int user_id;
    private String note;
    @JsonProperty("network")
    private String net_work;
    @JsonProperty("appList")
    private String app_list;
    @JsonProperty("startupTime")
    private int startup_time;
    private String countries;
    private String provinces;
    private String city;
    private String area;
    private String address;
    @JsonProperty("activationTime")
    private int activation_time;
    private String log;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getDevice_model() {
        return device_model;
    }

    public void setDevice_model(String device_model) {
        this.device_model = device_model;
    }

    public String getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(String gmt_create) {
        this.gmt_create = gmt_create;
    }

    public String getGmt_update() {
        return gmt_update;
    }

    public void setGmt_update(String gmt_update) {
        this.gmt_update = gmt_update;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public int getActivate_time() {
        return activate_time;
    }

    public void setActivate_time(int activate_time) {
        this.activate_time = activate_time;
    }

    public String getRom_model() {
        return rom_model;
    }

    public void setRom_model(String rom_model) {
        this.rom_model = rom_model;
    }

    public int getAlive_time() {
        return alive_time;
    }

    public void setAlive_time(int alive_time) {
        this.alive_time = alive_time;
    }

    public int getBinding_time() {
        return binding_time;
    }

    public void setBinding_time(int binding_time) {
        this.binding_time = binding_time;
    }

    public int getIs_debug() {
        return is_debug;
    }

    public void setIs_debug(int is_debug) {
        this.is_debug = is_debug;
    }

    public String getRom_version_name() {
        return rom_version_name;
    }

    public void setRom_version_name(String rom_version_name) {
        this.rom_version_name = rom_version_name;
    }

    public String getRom_version_code() {
        return rom_version_code;
    }

    public void setRom_version_code(String rom_version_code) {
        this.rom_version_code = rom_version_code;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNet_work() {
        return net_work;
    }

    public void setNet_work(String net_work) {
        this.net_work = net_work;
    }

    public String getApp_list() {
        return app_list;
    }

    public void setApp_list(String app_list) {
        this.app_list = app_list;
    }

    public int getStartup_time() {
        return startup_time;
    }

    public void setStartup_time(int startup_time) {
        this.startup_time = startup_time;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public String getProvinces() {
        return provinces;
    }

    public void setProvinces(String provinces) {
        this.provinces = provinces;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getActivation_time() {
        return activation_time;
    }

    public void setActivation_time(int activation_time) {
        this.activation_time = activation_time;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }
}
