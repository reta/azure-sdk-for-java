// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

import com.azure.resourcemanager.containerservice.fluent.models.MaintenanceConfigurationInner;
import com.azure.resourcemanager.containerservice.models.DateSpan;
import com.azure.resourcemanager.containerservice.models.MaintenanceWindow;
import com.azure.resourcemanager.containerservice.models.RelativeMonthlySchedule;
import com.azure.resourcemanager.containerservice.models.Schedule;
import com.azure.resourcemanager.containerservice.models.TimeInWeek;
import com.azure.resourcemanager.containerservice.models.TimeSpan;
import com.azure.resourcemanager.containerservice.models.Type;
import com.azure.resourcemanager.containerservice.models.WeekDay;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;

/** Samples for MaintenanceConfigurations CreateOrUpdate. */
public final class MaintenanceConfigurationsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2023-07-01/examples/MaintenanceConfigurationsCreate_Update.json
     */
    /**
     * Sample code: Create/Update Maintenance Configuration.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createUpdateMaintenanceConfiguration(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .kubernetesClusters()
            .manager()
            .serviceClient()
            .getMaintenanceConfigurations()
            .createOrUpdateWithResponse(
                "rg1",
                "clustername1",
                "default",
                new MaintenanceConfigurationInner()
                    .withTimeInWeek(
                        Arrays.asList(new TimeInWeek().withDay(WeekDay.MONDAY).withHourSlots(Arrays.asList(1, 2))))
                    .withNotAllowedTime(
                        Arrays
                            .asList(
                                new TimeSpan()
                                    .withStart(OffsetDateTime.parse("2020-11-26T03:00:00Z"))
                                    .withEnd(OffsetDateTime.parse("2020-11-30T12:00:00Z")))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2023-07-01/examples/MaintenanceConfigurationsCreate_Update_MaintenanceWindow.json
     */
    /**
     * Sample code: Create/Update Maintenance Configuration with Maintenance Window.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createUpdateMaintenanceConfigurationWithMaintenanceWindow(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .kubernetesClusters()
            .manager()
            .serviceClient()
            .getMaintenanceConfigurations()
            .createOrUpdateWithResponse(
                "rg1",
                "clustername1",
                "aksManagedAutoUpgradeSchedule",
                new MaintenanceConfigurationInner()
                    .withMaintenanceWindow(
                        new MaintenanceWindow()
                            .withSchedule(
                                new Schedule()
                                    .withRelativeMonthly(
                                        new RelativeMonthlySchedule()
                                            .withIntervalMonths(3)
                                            .withWeekIndex(Type.FIRST)
                                            .withDayOfWeek(WeekDay.MONDAY)))
                            .withDurationHours(10)
                            .withUtcOffset("+05:30")
                            .withStartDate(LocalDate.parse("2023-01-01"))
                            .withStartTime("08:30")
                            .withNotAllowedDates(
                                Arrays
                                    .asList(
                                        new DateSpan()
                                            .withStart(LocalDate.parse("2023-02-18"))
                                            .withEnd(LocalDate.parse("2023-02-25")),
                                        new DateSpan()
                                            .withStart(LocalDate.parse("2023-12-23"))
                                            .withEnd(LocalDate.parse("2024-01-05"))))),
                com.azure.core.util.Context.NONE);
    }
}
