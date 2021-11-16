package junits;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

public class EnvCheck implements ExecutionCondition{

	@Override
	public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
		// TODO Auto-generated method stub
		String ActualEnv = "DEV";
		String ExpectedEnv = "DEV";
		
		if(ActualEnv.equals(ExpectedEnv))
			return ConditionEvaluationResult.enabled("Env Matching");
		else
			return ConditionEvaluationResult.disabled("Not Matching");
	}

}
