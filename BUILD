COMPILE_DEPS = [
    "@commons_configuration//jar",
    "@commons_logging//jar",
    "@commons_collections//jar",
    "@commons_lang//jar",
    "@commons_lang3//jar",
    "@commons_io//jar",
    "@commons_pool//jar",
    "@com_google_guava_guava//jar",
    "@slf4j_api//jar",
    "@osgi_core//jar",
    "@org_osgi_util_promise//jar",
    "@org_osgi_service_component//jar",
    "@org_osgi_service_component_annotations//jar",
    "@org_osgi_service_metatype_annotations//jar",
    "@org_apache_karaf_features_core//jar",
    "@org_apache_karaf_system_core//jar",
    "@org_apache_servicemix_bundles_dom4j//jar",
    "@com_google_code_findbugs_jsr305//jar",
    "@junit//jar",
    "@hamcrest_all//jar",
    "@io_netty_netty-all_4150Final//jar",
    "@ch_qos_logback_logback-core_123//jar",
    "@ch_qos_logback_logback-classic_123//jar"
]

osgi_jar_with_tests(
    name="onos-openflowj",
    deps = COMPILE_DEPS,
    test_deps = TEST,
    srcs = glob(['src/**/*.java']),
    visibility = ["//visibility:public"]
)
