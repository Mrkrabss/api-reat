package com.rest_api.rest_api;

import java.util.List;
import java.util.Map;

import com.rest_api.rest_api.model.Device;
import com.rest_api.rest_api.model.MyData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping(path="/public/v1/device") 
public class MainController {
  @Autowired 
         
  private DeviceRepository deviceRepository;


  @PostMapping(path="/getmydevices")
  public @ResponseBody MyData<Iterable<Device>> getMyDevices(@RequestParam("userId") String userId,
  @RequestParam("device") String device) {
    // This returns a JSON or XML with the users
    List<Device> re=deviceRepository.getDeviceByUserId(userId,device);
    MyData<Iterable<Device>> myData;
    if(re==null){
        myData=new MyData<>(null);
        myData.setCode(434); 
        myData.setMsg("登录过期，重新登录"); 
    }else{
        myData=new MyData<>(re);
    }
    return myData;
  }

  @PostMapping(path="/setdebug")
  public @ResponseBody MyData<Integer> setDebug(@RequestParam("userId") String userId,
  @RequestParam("device") String device , @RequestParam("debug") int debug) {
    // This returns a JSON or XML with the users
    Integer re=deviceRepository.setDebug(userId,device,debug);
    MyData<Integer> myData;
    if(re==null){
        myData=new MyData<>(null);
        myData.setCode(434); 
        myData.setMsg("登录过期，重新登录"); 
    }else{
        myData=new MyData<>(re);
    }
    return myData;
  }


  @PostMapping(path="/addlog")
  public @ResponseBody MyData<Integer> addLog(@RequestParam("sn") String sn,
  @RequestParam("url") String url) {
    // This returns a JSON or XML with the users
    Integer s=deviceRepository.addLog(sn,url);
    MyData<Integer> myData;
    myData=new MyData<>(s);
    return myData;
  }

  

  @PostMapping(path="/addloglist")
  public @ResponseBody MyData<Iterable<String>> getLogList(@RequestParam("userId") String userId,
  @RequestParam("device") String device) {
    // This returns a JSON or XML with the users
    Iterable<String> re=deviceRepository.getLogList(userId,device);
    MyData<Iterable<String>> myData;
    if(re==null){
      myData=new MyData<>(null);
      myData.setCode(434); 
      myData.setMsg("登录过期，重新登录"); 
  }else{
      myData=new MyData<>(re);
  }
  return myData;
  }

}
