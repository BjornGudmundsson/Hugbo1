package is.hi.byrjun.controller.API;

import is.hi.byrjun.model.Course;

import java.util.ArrayList;

import is.hi.byrjun.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sindri Pétur Ingimundarson, Ketill Guðmundsson, Björn Guðmundsson, Ævar Aðalsteinsson
 * @date september 2017 HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 *
 * Endapunktar fyrir APAnn okkar, skilar JSON listum af námskeiðum
 */


@RestController
@RequestMapping("/api/namskeid") // Notice here that the Request Mapping is set at the Class level
public class CourseAPIController {

    @Autowired
    CourseService courseService;


    /**
     * Birtir lista af námskeiðum
     *
     * @return listi JSON listi allra námskeiða
     */
    // GET api/namskeid/
    @RequestMapping("")
    public ArrayList<Course> namskeid() {
        ArrayList<Course> listi;
        listi = (ArrayList<Course>) courseService.allCourse();
        return listi;
    }

    /**
     * Birtir lista af námskeiðum
     *
     * @param leit leitarstrengur
     * @return listi JSON listi námskeið þar sem leitarstrengurinn
     *         er innihaldinn í einhverjum field í módelinu
     */
    // GET api/namskeid/leit
    @RequestMapping(value = "/leit")
    public ArrayList<Course> namskeidLeit(@RequestParam(value="leit", required = true) String leit) {
        ArrayList<Course> listi;
        listi = (ArrayList<Course>) courseService.searchCourse(leit);
        return listi;
    }

}
