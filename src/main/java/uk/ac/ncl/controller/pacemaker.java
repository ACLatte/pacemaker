package uk.ac.ncl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Yang
 * @date 2022/2/10
 */
//this is contains all simulated echarts data methods
@RestController
public class pacemaker {

    //control pacemaker whether open
    @RequestMapping("/pacemakerSwitch")
    public List pacemakerSwitch(){

        return null;
    }

    //reset heartRate parameter to default value
    @RequestMapping("/resSet")
    public List resSet(){

        return null;
    }


    //adjust slider of HeartRate to change echarts
    @RequestMapping("/heartRate")
    public List heartRate(){

        return null;
    }

    //adjust slider of PRInterval to change echarts
    @RequestMapping("/PRInterval")
    public List PRInterval(){

        return null;
    }

    //choice different button to change different mode
    @RequestMapping("/modeAAI")
    public List modeAAI(){

        return null;
    }

    @RequestMapping("/modeVDD")
    public List modeVDD(){

        return null;
    }

    @RequestMapping("/modeDDD")
    public List modeDDD(){

        return null;
    }
}
