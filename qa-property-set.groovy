propertySets {
  propertySet('QA') {
    singleSelect('Availability') {
      defaultValue "General"
      value "Limited"
      value "Rollback"
    }
    multiSelect('Browser support') {
      defaultValue "Chrome"
      defaultValue "Firefox"
      value "Internet Explorer 5"
    }
    anyValue('Quality Comments') {
      defaultValue "Fail"
    }
  }
}
