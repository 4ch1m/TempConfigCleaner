package de.achimonline.tempconfigcleaner

import com.intellij.execution.RunManagerEx
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.ProjectActivity

class TempConfigCleaner : ProjectActivity {
    override suspend fun execute(project: Project) {
        val runManager = RunManagerEx.getInstanceEx(project)

        runManager.tempConfigurationsList.forEach {
            runManager.removeConfiguration(it)
        }

        if (runManager.selectedConfiguration == null) {
            runManager.allSettings.firstOrNull()?.let {
                runManager.selectedConfiguration = it
            }
        }
    }
}
