package com.ripal.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

    //Versioning using "URI based versioning"    ex- Twitter
    @RequestMapping(method = RequestMethod.GET, path = "v1/person")
    public  PersonV1 personV1(){
        return new PersonV1("Bob Charlie");
    }

    @RequestMapping(method = RequestMethod.GET, path = "v2/person")
    public  PersonV2 personV2(){
        return new PersonV2(new Name("Bob","Charlie"));
    }

    //Versioning using "request Param"   ex- Amazon
    @RequestMapping(method = RequestMethod.GET, value = "/person/param", params = "version=1")
    public  PersonV1 paramV1(){
        return new PersonV1("Bob Charlie");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/person/param", params = "version=2")
    public  PersonV2 paramV2(){
        return new PersonV2(new Name("Bob","Charlie"));
    }

    //Versioning using "header param" or "header versioning"    ex - Microsoft
    @RequestMapping(method = RequestMethod.GET, value = "/person/header", headers = "X-API-VERSION=1")
    public  PersonV1 headerV1(){
        return new PersonV1("Bob Charlie");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/person/header", headers = "X-API-VERSION=2")
    public  PersonV2 headerV2(){
        return new PersonV2(new Name("Bob","Charlie"));
    }

    //Versioning using "produces" or "Accept header versioning" or "MIME type versioning"       ex - GitHub
    @RequestMapping(method = RequestMethod.GET, value = "/person/produces", produces = "application/vnd.company.app-v1+json")
    public  PersonV1 producesV1(){
        return new PersonV1("Bob Charlie");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/person/produces", produces = "application/vnd.company.app-v2+json")
    public  PersonV2 producesV2(){
        return new PersonV2(new Name("Bob","Charlie"));
    }
}
