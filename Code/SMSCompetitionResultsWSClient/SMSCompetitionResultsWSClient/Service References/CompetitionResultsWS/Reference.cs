﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.17379
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace SMSCompetitionResultsWSClient.CompetitionResultsWS {
    
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(Namespace="http://competitionresults.sms.org/", ConfigurationName="CompetitionResultsWS.CompetitionsResultsWS")]
    public interface CompetitionsResultsWS {
        
        // CODEGEN: Generating message contract since element name id from namespace  is not marked nillable
        [System.ServiceModel.OperationContractAttribute(Action="http://competitionresults.sms.org/CompetitionsResultsWS/getCompetitionByIdRequest" +
            "", ReplyAction="http://competitionresults.sms.org/CompetitionsResultsWS/getCompetitionByIdRespons" +
            "e")]
        SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionByIdResponse getCompetitionById(SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionByIdRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://competitionresults.sms.org/CompetitionsResultsWS/getCompetitionByIdRequest" +
            "", ReplyAction="http://competitionresults.sms.org/CompetitionsResultsWS/getCompetitionByIdRespons" +
            "e")]
        System.Threading.Tasks.Task<SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionByIdResponse> getCompetitionByIdAsync(SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionByIdRequest request);
        
        // CODEGEN: Generating message contract since element name liga from namespace  is not marked nillable
        [System.ServiceModel.OperationContractAttribute(Action="http://competitionresults.sms.org/CompetitionsResultsWS/getCompetitionResultsRequ" +
            "est", ReplyAction="http://competitionresults.sms.org/CompetitionsResultsWS/getCompetitionResultsResp" +
            "onse")]
        SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionResultsResponse getCompetitionResults(SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionResultsRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://competitionresults.sms.org/CompetitionsResultsWS/getCompetitionResultsRequ" +
            "est", ReplyAction="http://competitionresults.sms.org/CompetitionsResultsWS/getCompetitionResultsResp" +
            "onse")]
        System.Threading.Tasks.Task<SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionResultsResponse> getCompetitionResultsAsync(SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionResultsRequest request);
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class getCompetitionByIdRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="getCompetitionById", Namespace="http://competitionresults.sms.org/", Order=0)]
        public SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionByIdRequestBody Body;
        
        public getCompetitionByIdRequest() {
        }
        
        public getCompetitionByIdRequest(SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionByIdRequestBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute(Namespace="")]
    public partial class getCompetitionByIdRequestBody {
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=0)]
        public string id;
        
        public getCompetitionByIdRequestBody() {
        }
        
        public getCompetitionByIdRequestBody(string id) {
            this.id = id;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class getCompetitionByIdResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="getCompetitionByIdResponse", Namespace="http://competitionresults.sms.org/", Order=0)]
        public SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionByIdResponseBody Body;
        
        public getCompetitionByIdResponse() {
        }
        
        public getCompetitionByIdResponse(SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionByIdResponseBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute(Namespace="")]
    public partial class getCompetitionByIdResponseBody {
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=0)]
        public string @return;
        
        public getCompetitionByIdResponseBody() {
        }
        
        public getCompetitionByIdResponseBody(string @return) {
            this.@return = @return;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class getCompetitionResultsRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="getCompetitionResults", Namespace="http://competitionresults.sms.org/", Order=0)]
        public SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionResultsRequestBody Body;
        
        public getCompetitionResultsRequest() {
        }
        
        public getCompetitionResultsRequest(SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionResultsRequestBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute(Namespace="")]
    public partial class getCompetitionResultsRequestBody {
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=0)]
        public string liga;
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=1)]
        public string sport;
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=2)]
        public string datum;
        
        public getCompetitionResultsRequestBody() {
        }
        
        public getCompetitionResultsRequestBody(string liga, string sport, string datum) {
            this.liga = liga;
            this.sport = sport;
            this.datum = datum;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class getCompetitionResultsResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="getCompetitionResultsResponse", Namespace="http://competitionresults.sms.org/", Order=0)]
        public SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionResultsResponseBody Body;
        
        public getCompetitionResultsResponse() {
        }
        
        public getCompetitionResultsResponse(SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionResultsResponseBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute(Namespace="")]
    public partial class getCompetitionResultsResponseBody {
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=0)]
        public string @return;
        
        public getCompetitionResultsResponseBody() {
        }
        
        public getCompetitionResultsResponseBody(string @return) {
            this.@return = @return;
        }
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface CompetitionsResultsWSChannel : SMSCompetitionResultsWSClient.CompetitionResultsWS.CompetitionsResultsWS, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public partial class CompetitionsResultsWSClient : System.ServiceModel.ClientBase<SMSCompetitionResultsWSClient.CompetitionResultsWS.CompetitionsResultsWS>, SMSCompetitionResultsWSClient.CompetitionResultsWS.CompetitionsResultsWS {
        
        public CompetitionsResultsWSClient() {
        }
        
        public CompetitionsResultsWSClient(string endpointConfigurationName) : 
                base(endpointConfigurationName) {
        }
        
        public CompetitionsResultsWSClient(string endpointConfigurationName, string remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public CompetitionsResultsWSClient(string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public CompetitionsResultsWSClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(binding, remoteAddress) {
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionByIdResponse SMSCompetitionResultsWSClient.CompetitionResultsWS.CompetitionsResultsWS.getCompetitionById(SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionByIdRequest request) {
            return base.Channel.getCompetitionById(request);
        }
        
        public string getCompetitionById(string id) {
            SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionByIdRequest inValue = new SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionByIdRequest();
            inValue.Body = new SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionByIdRequestBody();
            inValue.Body.id = id;
            SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionByIdResponse retVal = ((SMSCompetitionResultsWSClient.CompetitionResultsWS.CompetitionsResultsWS)(this)).getCompetitionById(inValue);
            return retVal.Body.@return;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionByIdResponse> SMSCompetitionResultsWSClient.CompetitionResultsWS.CompetitionsResultsWS.getCompetitionByIdAsync(SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionByIdRequest request) {
            return base.Channel.getCompetitionByIdAsync(request);
        }
        
        public System.Threading.Tasks.Task<SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionByIdResponse> getCompetitionByIdAsync(string id) {
            SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionByIdRequest inValue = new SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionByIdRequest();
            inValue.Body = new SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionByIdRequestBody();
            inValue.Body.id = id;
            return ((SMSCompetitionResultsWSClient.CompetitionResultsWS.CompetitionsResultsWS)(this)).getCompetitionByIdAsync(inValue);
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionResultsResponse SMSCompetitionResultsWSClient.CompetitionResultsWS.CompetitionsResultsWS.getCompetitionResults(SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionResultsRequest request) {
            return base.Channel.getCompetitionResults(request);
        }
        
        public string getCompetitionResults(string liga, string sport, string datum) {
            SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionResultsRequest inValue = new SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionResultsRequest();
            inValue.Body = new SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionResultsRequestBody();
            inValue.Body.liga = liga;
            inValue.Body.sport = sport;
            inValue.Body.datum = datum;
            SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionResultsResponse retVal = ((SMSCompetitionResultsWSClient.CompetitionResultsWS.CompetitionsResultsWS)(this)).getCompetitionResults(inValue);
            return retVal.Body.@return;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionResultsResponse> SMSCompetitionResultsWSClient.CompetitionResultsWS.CompetitionsResultsWS.getCompetitionResultsAsync(SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionResultsRequest request) {
            return base.Channel.getCompetitionResultsAsync(request);
        }
        
        public System.Threading.Tasks.Task<SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionResultsResponse> getCompetitionResultsAsync(string liga, string sport, string datum) {
            SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionResultsRequest inValue = new SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionResultsRequest();
            inValue.Body = new SMSCompetitionResultsWSClient.CompetitionResultsWS.getCompetitionResultsRequestBody();
            inValue.Body.liga = liga;
            inValue.Body.sport = sport;
            inValue.Body.datum = datum;
            return ((SMSCompetitionResultsWSClient.CompetitionResultsWS.CompetitionsResultsWS)(this)).getCompetitionResultsAsync(inValue);
        }
    }
}
