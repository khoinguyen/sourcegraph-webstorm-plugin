package com.github.khoinguyen.sourcegraphwebstormplugin.services

import com.github.khoinguyen.sourcegraphwebstormplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
