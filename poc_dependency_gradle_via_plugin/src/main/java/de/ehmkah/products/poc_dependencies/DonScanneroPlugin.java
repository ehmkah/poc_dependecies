package de.ehmkah.products.poc_dependencies;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class DonScanneroPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        DonScanneroPluginConfiguration scanneroPluginConfiguration = project.getExtensions().create("scannero", DonScanneroPluginConfiguration.class);
        DonScanneroTask scanneroTask = project.getTasks().create("scannero", DonScanneroTask.class);
        scanneroTask.setDonScanneroPluginConfiguration(scanneroPluginConfiguration);
    }
}

