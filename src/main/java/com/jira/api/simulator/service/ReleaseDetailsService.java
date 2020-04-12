package com.jira.api.simulator.service;

import static com.jira.api.simulator.values.ExecutionStatus.FAILED;
import static com.jira.api.simulator.values.ExecutionStatus.NOT_EXECUTED;
import static com.jira.api.simulator.values.ExecutionStatus.PASSED;
import static com.jira.api.simulator.values.ExecutionStatus.PENDING;
import static com.jira.api.simulator.values.Points.EIGHT;
import static com.jira.api.simulator.values.Points.ONE;
import static com.jira.api.simulator.values.Points.THIRTEEN;
import static com.jira.api.simulator.values.Points.THREE;
import static com.jira.api.simulator.values.Points.TWO;
import static com.jira.api.simulator.values.Priority.P1;
import static com.jira.api.simulator.values.Priority.P2;
import static com.jira.api.simulator.values.Priority.P3;
import static com.jira.api.simulator.values.Severity.HIGH;
import static com.jira.api.simulator.values.Severity.LOW;
import static com.jira.api.simulator.values.Severity.MEDIUM;
import static com.jira.api.simulator.values.Status.CLOSED;
import static com.jira.api.simulator.values.Status.OPEN;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jira.api.simulator.entity.Defect;
import com.jira.api.simulator.entity.ReleaseReport;
import com.jira.api.simulator.entity.Story;
import com.jira.api.simulator.entity.TestCase;
import com.jira.api.simulator.values.Points;
import com.jira.api.simulator.values.Status;

@Service
public class ReleaseDetailsService {

	String projectName;
	String releaseVersion;

	public ReleaseReport getReleaseDetails(String projectName, String releaseVersion) {
		this.projectName = projectName;
		this.releaseVersion = releaseVersion;
		return new ReleaseReport(projectName, releaseVersion, getStoryList());
	}

	private List<Story> getStoryList() {
		
		if(projectName.equalsIgnoreCase("CAI") && releaseVersion.equalsIgnoreCase("april_2020_03")){
			return Arrays.asList(
					new Story("ONEFDP-6574", Status.CLOSED, Points.FIVE.getPoints(),
							Arrays.asList
						   (new Defect("ONEFDP-9234", CLOSED, MEDIUM, P1, THIRTEEN.getPoints()),
							new Defect("ONEFDP-9364", CLOSED, HIGH, P2, TWO.getPoints()),
							new Defect("ONEFDP-9234", CLOSED, MEDIUM, P1,THIRTEEN.getPoints()),
							new Defect("ONEFDP-9964", CLOSED, HIGH, P3, THREE.getPoints()),
							new Defect("ONEFDP-9344", CLOSED, LOW, P1, EIGHT.getPoints()),
							new Defect("ONEFDP-9664", CLOSED, HIGH, P3, ONE.getPoints())
							),
							Arrays.asList
							(new TestCase("ONEFDP-9999", PASSED), new TestCase("ONEFDP-9999", PASSED),
									new TestCase("ONEFDP-9991", PASSED),new TestCase("ONEFDP-9992", PENDING),
									new TestCase("ONEFDP-9994", PASSED),new TestCase("ONEFDP-9993", PENDING),
									new TestCase("ONEFDP-9995", PASSED),new TestCase("ONEFDP-9199", PENDING),
									new TestCase("ONEFDP-9996", PASSED),new TestCase("ONEFDP-9299", PENDING),
									new TestCase("ONEFDP-9997", PASSED),new TestCase("ONEFDP-9399", PASSED),
									new TestCase("ONEFDP-9998", FAILED),new TestCase("ONEFDP-9499", PASSED),
									new TestCase("ONEFDP-1999", PASSED),new TestCase("ONEFDP-9599", NOT_EXECUTED),
									new TestCase("ONEFDP-2999", NOT_EXECUTED),new TestCase("ONEFDP-9699", PASSED),
									new TestCase("ONEFDP-3999", NOT_EXECUTED),new TestCase("ONEFDP-9799", PASSED),
									new TestCase("ONEFDP-4999", PASSED),new TestCase("ONEFDP-9899", PASSED),
									new TestCase("ONEFDP-5999", PASSED),new TestCase("ONEFDP-9099", FAILED),
									new TestCase("ONEFDP-6999", PASSED),new TestCase("ONEFDP-5599", PASSED))
							),
					new Story("ONEFDP-9575", CLOSED, EIGHT.getPoints(), 
							Arrays.asList
						   (new Defect("ONEFDP-51234", CLOSED, MEDIUM, P1, THIRTEEN.getPoints()),
							new Defect("ONEFDP-57364", CLOSED, HIGH, P2, TWO.getPoints()),
							new Defect("ONEFDP-51234", CLOSED, MEDIUM, P1, THIRTEEN.getPoints()),
							new Defect("ONEFDP-51964", CLOSED, HIGH, P3, THREE.getPoints()),
							new Defect("ONEFDP-53344", CLOSED, LOW, P1, EIGHT.getPoints()),
							new Defect("ONEFDP-55664", CLOSED, HIGH, P3, ONE.getPoints())
							),
							Arrays.asList
							(new TestCase("ONEFDP-8888", PASSED), new TestCase("ONEFDP-8888", PASSED),
									new TestCase("ONEFDP-8881", PASSED),new TestCase("ONEFDP-8882", PENDING),
									new TestCase("ONEFDP-8884", PASSED),new TestCase("ONEFDP-8883", PENDING),
									new TestCase("ONEFDP-8885", PASSED),new TestCase("ONEFDP-8188", PENDING),
									new TestCase("ONEFDP-8886", PASSED),new TestCase("ONEFDP-8288", PENDING),
									new TestCase("ONEFDP-8887", PASSED),new TestCase("ONEFDP-8388", PASSED),
									new TestCase("ONEFDP-8888", FAILED),new TestCase("ONEFDP-8488", PASSED),
									new TestCase("ONEFDP-1888", PASSED),new TestCase("ONEFDP-8588", NOT_EXECUTED),
									new TestCase("ONEFDP-2888", NOT_EXECUTED),new TestCase("ONEFDP-8688", PASSED),
									new TestCase("ONEFDP-3888", NOT_EXECUTED),new TestCase("ONEFDP-8788", PASSED),
									new TestCase("ONEFDP-4888", PASSED),new TestCase("ONEFDP-8888", PASSED),
									new TestCase("ONEFDP-5888", PASSED),new TestCase("ONEFDP-8088", FAILED),
									new TestCase("ONEFDP-6888", PASSED),new TestCase("ONEFDP-5588", PASSED))
							),
					new Story("ONEFDP-6774", Status.OPEN, Points.THREE.getPoints(), 
							Arrays.asList
							(new Defect("ONEFDP-61234", CLOSED, MEDIUM, P1,THIRTEEN.getPoints()),
							new Defect("ONEFDP-67364", OPEN, HIGH, P2, TWO.getPoints()),
							new Defect("ONEFDP-61234", CLOSED, MEDIUM, P1,THIRTEEN.getPoints()),
							new Defect("ONEFDP-61964", CLOSED, HIGH, P3, THREE.getPoints()),
							new Defect("ONEFDP-63344", CLOSED, LOW, P1, EIGHT.getPoints()),
							new Defect("ONEFDP-65664", OPEN, HIGH, P3, ONE.getPoints())),
							Arrays.asList
							(new TestCase("ONEFDP-7777", PASSED), new TestCase("ONEFDP-7777", PASSED),
									new TestCase("ONEFDP-7771", PASSED),new TestCase("ONEFDP-7772", PENDING),
									new TestCase("ONEFDP-7774", PASSED),new TestCase("ONEFDP-7773", PENDING),
									new TestCase("ONEFDP-7775", PASSED),new TestCase("ONEFDP-7177", PENDING),
									new TestCase("ONEFDP-7776", PASSED),new TestCase("ONEFDP-7277", PENDING),
									new TestCase("ONEFDP-7777", PASSED),new TestCase("ONEFDP-7377", PASSED),
									new TestCase("ONEFDP-7777", FAILED),new TestCase("ONEFDP-7477", PASSED),
									new TestCase("ONEFDP-1777", PASSED),new TestCase("ONEFDP-7577", NOT_EXECUTED),
									new TestCase("ONEFDP-2777", NOT_EXECUTED),new TestCase("ONEFDP-7677", PASSED),
									new TestCase("ONEFDP-3777", NOT_EXECUTED),new TestCase("ONEFDP-7777", PASSED),
									new TestCase("ONEFDP-4777", PASSED),new TestCase("ONEFDP-7777", PASSED),
									new TestCase("ONEFDP-5777", PASSED),new TestCase("ONEFDP-7077", FAILED),
									new TestCase("ONEFDP-6777", PASSED),new TestCase("ONEFDP-5577", PASSED))
							)
					);
		} else if (projectName.equalsIgnoreCase("CAI") && releaseVersion.equalsIgnoreCase("april_2020_04")) {
			return Arrays.asList(
					new Story("ONEFDP-6574", Status.OPEN, Points.FIVE.getPoints(),
							Arrays.asList
						   (new Defect("ONEFDP-9234", CLOSED, MEDIUM, P1, THIRTEEN.getPoints()),
							new Defect("ONEFDP-9364", CLOSED, HIGH, P2, TWO.getPoints()),
							new Defect("ONEFDP-9234", CLOSED, MEDIUM, P1,THIRTEEN.getPoints()),
							new Defect("ONEFDP-9964", CLOSED, HIGH, P3, THREE.getPoints()),
							new Defect("ONEFDP-9344", CLOSED, LOW, P1, EIGHT.getPoints()),
							new Defect("ONEFDP-9664", OPEN, LOW, P3, ONE.getPoints())
							),
							Arrays.asList
							(new TestCase("ONEFDP-9999", PASSED), new TestCase("ONEFDP-9999", PASSED),
									new TestCase("ONEFDP-9991", PASSED),new TestCase("ONEFDP-9992", PASSED),
									new TestCase("ONEFDP-9994", PASSED),new TestCase("ONEFDP-9993", PASSED),
									new TestCase("ONEFDP-9995", PASSED),new TestCase("ONEFDP-9199", PASSED),
									new TestCase("ONEFDP-9996", NOT_EXECUTED),new TestCase("ONEFDP-9299", PASSED),
									new TestCase("ONEFDP-9997", PASSED),new TestCase("ONEFDP-9399", PASSED),
									new TestCase("ONEFDP-9998", PASSED),new TestCase("ONEFDP-9499", PASSED),
									new TestCase("ONEFDP-1999", PASSED),new TestCase("ONEFDP-9599", PASSED),
									new TestCase("ONEFDP-2999", PASSED),new TestCase("ONEFDP-9699", PASSED),
									new TestCase("ONEFDP-3999", PASSED),new TestCase("ONEFDP-9799", PASSED),
									new TestCase("ONEFDP-4999", PASSED),new TestCase("ONEFDP-9899", PASSED),
									new TestCase("ONEFDP-5999", PASSED),new TestCase("ONEFDP-9099", PASSED),
									new TestCase("ONEFDP-6999", PASSED),new TestCase("ONEFDP-5599", PASSED))
							),
					new Story("ONEFDP-9575", CLOSED, EIGHT.getPoints(),  
							Arrays.asList
						   (new Defect("ONEFDP-51234", CLOSED, MEDIUM, P1, THIRTEEN.getPoints()),
							new Defect("ONEFDP-57364", CLOSED, HIGH, P2, TWO.getPoints()),
							new Defect("ONEFDP-51234", CLOSED, MEDIUM, P1, THIRTEEN.getPoints()),
							new Defect("ONEFDP-51964", CLOSED, HIGH, P3, THREE.getPoints()),
							new Defect("ONEFDP-53344", CLOSED, LOW, P1, EIGHT.getPoints()),
							new Defect("ONEFDP-55664", CLOSED, HIGH, P3, ONE.getPoints())
							),
							Arrays.asList
							(new TestCase("ONEFDP-8888", PASSED), new TestCase("ONEFDP-8888", PASSED),
									new TestCase("ONEFDP-8881", PASSED),new TestCase("ONEFDP-8882", PASSED),
									new TestCase("ONEFDP-8884", PASSED),new TestCase("ONEFDP-8883", PASSED),
									new TestCase("ONEFDP-8885", PASSED),new TestCase("ONEFDP-8188", PASSED),
									new TestCase("ONEFDP-8886", PASSED),new TestCase("ONEFDP-8288", PASSED),
									new TestCase("ONEFDP-8887", PASSED),new TestCase("ONEFDP-8388", PASSED),
									new TestCase("ONEFDP-8888", PASSED),new TestCase("ONEFDP-8488", PASSED),
									new TestCase("ONEFDP-1888", NOT_EXECUTED),new TestCase("ONEFDP-8588", PASSED),
									new TestCase("ONEFDP-2888", PASSED),new TestCase("ONEFDP-8688", PASSED),
									new TestCase("ONEFDP-3888", PASSED),new TestCase("ONEFDP-8788", PASSED),
									new TestCase("ONEFDP-4888", PASSED),new TestCase("ONEFDP-8888", PASSED),
									new TestCase("ONEFDP-5888", PASSED),new TestCase("ONEFDP-8088", PASSED),
									new TestCase("ONEFDP-6888", PASSED),new TestCase("ONEFDP-5588", PASSED))
							),
					new Story("ONEFDP-6774", Status.CLOSED, Points.THREE.getPoints(), 
							Arrays.asList
							(new Defect("ONEFDP-61234", CLOSED, MEDIUM, P1,THIRTEEN.getPoints()),
							new Defect("ONEFDP-67364", CLOSED, HIGH, P2, TWO.getPoints()),
							new Defect("ONEFDP-61234", CLOSED, MEDIUM, P1,THIRTEEN.getPoints()),
							new Defect("ONEFDP-61964", CLOSED, HIGH, P3, THREE.getPoints()),
							new Defect("ONEFDP-63344", CLOSED, LOW, P1, EIGHT.getPoints()),
							new Defect("ONEFDP-65664", CLOSED, HIGH, P3, ONE.getPoints())),
							Arrays.asList
							(new TestCase("ONEFDP-7777", PASSED), new TestCase("ONEFDP-7777", PASSED),
									new TestCase("ONEFDP-7771", PASSED),new TestCase("ONEFDP-7772", PASSED),
									new TestCase("ONEFDP-7774", PASSED),new TestCase("ONEFDP-7773", PASSED),
									new TestCase("ONEFDP-7775", PASSED),new TestCase("ONEFDP-7177", PASSED),
									new TestCase("ONEFDP-7776", PASSED),new TestCase("ONEFDP-7277", PASSED),
									new TestCase("ONEFDP-7777", PASSED),new TestCase("ONEFDP-7377", PASSED),
									new TestCase("ONEFDP-7777", PASSED),new TestCase("ONEFDP-7477", FAILED),
									new TestCase("ONEFDP-1777", PASSED),new TestCase("ONEFDP-7577", PASSED),
									new TestCase("ONEFDP-2777", PASSED),new TestCase("ONEFDP-7677", PASSED),
									new TestCase("ONEFDP-3777", PASSED),new TestCase("ONEFDP-7777", PASSED),
									new TestCase("ONEFDP-4777", PASSED),new TestCase("ONEFDP-7777", PASSED),
									new TestCase("ONEFDP-5777", PASSED),new TestCase("ONEFDP-7077", PASSED),
									new TestCase("ONEFDP-6777", PASSED),new TestCase("ONEFDP-5577", PASSED))
							)
					);
		
		} else {

			return Arrays.asList(
					new Story("ONEFDP-6574", Status.CLOSED, Points.FIVE.getPoints(),
							Arrays.asList
						   (new Defect("ONEFDP-9234", CLOSED, MEDIUM, P1, THIRTEEN.getPoints()),
							new Defect("ONEFDP-9364", CLOSED, HIGH, P2, TWO.getPoints()),
							new Defect("ONEFDP-9234", CLOSED, MEDIUM, P1,THIRTEEN.getPoints()),
							new Defect("ONEFDP-9964", CLOSED, HIGH, P3, THREE.getPoints()),
							new Defect("ONEFDP-9344", CLOSED, LOW, P1, EIGHT.getPoints()),
							new Defect("ONEFDP-9664", CLOSED, LOW, P3, ONE.getPoints())
							),
							Arrays.asList
							(new TestCase("ONEFDP-9999", PASSED), new TestCase("ONEFDP-9999", PASSED),
									new TestCase("ONEFDP-9991", PASSED),new TestCase("ONEFDP-9992", PASSED),
									new TestCase("ONEFDP-9994", PASSED),new TestCase("ONEFDP-9993", PASSED),
									new TestCase("ONEFDP-9995", PASSED),new TestCase("ONEFDP-9199", PASSED),
									new TestCase("ONEFDP-9996", NOT_EXECUTED),new TestCase("ONEFDP-9299", PASSED),
									new TestCase("ONEFDP-9997", PASSED),new TestCase("ONEFDP-9399", PASSED),
									new TestCase("ONEFDP-9998", PASSED),new TestCase("ONEFDP-9499", PASSED),
									new TestCase("ONEFDP-1999", PASSED),new TestCase("ONEFDP-9599", PASSED),
									new TestCase("ONEFDP-2999", PASSED),new TestCase("ONEFDP-9699", PASSED),
									new TestCase("ONEFDP-3999", PASSED),new TestCase("ONEFDP-9799", PASSED),
									new TestCase("ONEFDP-4999", PASSED),new TestCase("ONEFDP-9899", PASSED),
									new TestCase("ONEFDP-5999", PASSED),new TestCase("ONEFDP-9099", PASSED),
									new TestCase("ONEFDP-6999", PASSED),new TestCase("ONEFDP-5599", PASSED))
							),
					new Story("ONEFDP-9575", CLOSED, EIGHT.getPoints(), 
							Arrays.asList
						   (new Defect("ONEFDP-51234", CLOSED, MEDIUM, P1, THIRTEEN.getPoints()),
							new Defect("ONEFDP-57364", CLOSED, HIGH, P2, TWO.getPoints()),
							new Defect("ONEFDP-51234", CLOSED, MEDIUM, P1, THIRTEEN.getPoints()),
							new Defect("ONEFDP-51964", CLOSED, HIGH, P3, THREE.getPoints()),
							new Defect("ONEFDP-53344", CLOSED, LOW, P1, EIGHT.getPoints()),
							new Defect("ONEFDP-55664", CLOSED, HIGH, P3, ONE.getPoints())
							),
							Arrays.asList
							(new TestCase("ONEFDP-8888", PASSED), new TestCase("ONEFDP-8888", PASSED),
									new TestCase("ONEFDP-8881", PASSED),new TestCase("ONEFDP-8882", PASSED),
									new TestCase("ONEFDP-8884", PASSED),new TestCase("ONEFDP-8883", PASSED),
									new TestCase("ONEFDP-8885", PASSED),new TestCase("ONEFDP-8188", PASSED),
									new TestCase("ONEFDP-8886", PASSED),new TestCase("ONEFDP-8288", PASSED),
									new TestCase("ONEFDP-8887", PASSED),new TestCase("ONEFDP-8388", PASSED),
									new TestCase("ONEFDP-8888", PASSED),new TestCase("ONEFDP-8488", PASSED),
									new TestCase("ONEFDP-1888", NOT_EXECUTED),new TestCase("ONEFDP-8588", PASSED),
									new TestCase("ONEFDP-2888", PASSED),new TestCase("ONEFDP-8688", PASSED),
									new TestCase("ONEFDP-3888", PASSED),new TestCase("ONEFDP-8788", PASSED),
									new TestCase("ONEFDP-4888", PASSED),new TestCase("ONEFDP-8888", PASSED),
									new TestCase("ONEFDP-5888", PASSED),new TestCase("ONEFDP-8088", PASSED),
									new TestCase("ONEFDP-6888", PASSED),new TestCase("ONEFDP-5588", PASSED))
							),
					new Story("ONEFDP-6774", Status.CLOSED, Points.THREE.getPoints(), 
							Arrays.asList
							(new Defect("ONEFDP-61234", CLOSED, MEDIUM, P1,THIRTEEN.getPoints()),
							new Defect("ONEFDP-67364", CLOSED, HIGH, P2, TWO.getPoints()),
							new Defect("ONEFDP-61234", CLOSED, MEDIUM, P1,THIRTEEN.getPoints()),
							new Defect("ONEFDP-61964", CLOSED, HIGH, P3, THREE.getPoints()),
							new Defect("ONEFDP-63344", CLOSED, LOW, P1, EIGHT.getPoints()),
							new Defect("ONEFDP-65664", CLOSED, HIGH, P3, ONE.getPoints())),
							Arrays.asList
							(new TestCase("ONEFDP-7777", PASSED), new TestCase("ONEFDP-7777", PASSED),
									new TestCase("ONEFDP-7771", PASSED),new TestCase("ONEFDP-7772", PASSED),
									new TestCase("ONEFDP-7774", PASSED),new TestCase("ONEFDP-7773", PASSED),
									new TestCase("ONEFDP-7775", PASSED),new TestCase("ONEFDP-7177", PASSED),
									new TestCase("ONEFDP-7776", PASSED),new TestCase("ONEFDP-7277", PASSED),
									new TestCase("ONEFDP-7777", PASSED),new TestCase("ONEFDP-7377", PASSED),
									new TestCase("ONEFDP-7777", PASSED),new TestCase("ONEFDP-7477", FAILED),
									new TestCase("ONEFDP-1777", PASSED),new TestCase("ONEFDP-7577", PASSED),
									new TestCase("ONEFDP-2777", PASSED),new TestCase("ONEFDP-7677", PASSED),
									new TestCase("ONEFDP-3777", PASSED),new TestCase("ONEFDP-7777", PASSED),
									new TestCase("ONEFDP-4777", PASSED),new TestCase("ONEFDP-7777", PASSED),
									new TestCase("ONEFDP-5777", PASSED),new TestCase("ONEFDP-7077", PASSED),
									new TestCase("ONEFDP-6777", PASSED),new TestCase("ONEFDP-5577", PASSED))
							)
					);
		
		}

	}
}
