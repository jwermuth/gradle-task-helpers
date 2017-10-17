package dk.danskespil.test.helpers.commandlineexecutor

import org.gradle.api.DefaultTask
import org.gradle.api.Project

class DSCommandLineExecutor extends AbstractDSCommandLineExecutor {
    DSCommandLineExecutor(Project project) {
        super(project)
    }

    def executeExecSpec(DefaultTask task, Closure e) {
        task.project.exec e
    }
}
