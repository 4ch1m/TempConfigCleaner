package de.achimonline.tempconfigcleaner;

import com.intellij.execution.RunManagerEx;
import com.intellij.execution.RunnerAndConfigurationSettings;
import com.intellij.openapi.components.AbstractProjectComponent;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Iterator;

public class TempConfigCleaner extends AbstractProjectComponent {
    private Project project;

    protected TempConfigCleaner(Project project) {
        super(project);

        this.project = project;
    }

    @Override
    public void projectOpened() {
        RunManagerEx runManager = RunManagerEx.getInstanceEx(project);
        Iterator<RunnerAndConfigurationSettings> tempConfigurationsIterator = runManager.getTempConfigurationsList().iterator();

        while (tempConfigurationsIterator.hasNext()) {
            runManager.removeConfiguration(tempConfigurationsIterator.next());
        }

        if (runManager.getSelectedConfiguration() == null) {
            Collection<RunnerAndConfigurationSettings> sortedConfigurations = runManager.getAllSettings();

            if (!sortedConfigurations.isEmpty()) {
                runManager.setSelectedConfiguration(sortedConfigurations.iterator().next());
            }
        }
    }

    @NotNull
    @Override
    public String getComponentName() {
        return "TempConfig Cleaner";
    }
}
