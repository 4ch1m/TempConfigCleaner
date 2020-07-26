package de.achimonline.tempconfigcleaner;

import com.intellij.execution.RunManagerEx;
import com.intellij.execution.RunnerAndConfigurationSettings;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupActivity;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class TempConfigCleaner implements StartupActivity, DumbAware {

    @Override
    public void runActivity(@NotNull Project project) {
        RunManagerEx runManager = RunManagerEx.getInstanceEx(project);

        for (RunnerAndConfigurationSettings runnerAndConfigurationSettings : runManager.getTempConfigurationsList()) {
            runManager.removeConfiguration(runnerAndConfigurationSettings);
        }

        if (runManager.getSelectedConfiguration() == null) {
            Collection<RunnerAndConfigurationSettings> sortedConfigurations = runManager.getAllSettings();

            if (!sortedConfigurations.isEmpty()) {
                runManager.setSelectedConfiguration(sortedConfigurations.iterator().next());
            }
        }
    }

}
