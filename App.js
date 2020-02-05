import React, { Component } from "react";
import { View, Text, NativeModules, TouchableOpacity } from "react-native";

const HelloWorld = NativeModules.HelloWorldModule;

export default class App extends Component{
  render(){
    return(
      <View style={{flex:1, alignItems: "center", justifyContent:'center'}}>
        <TouchableOpacity onPress={()=>{
          HelloWorld.ShowMessage("This is first time we are creating bridge. :)", 5000);
        }}>
          <Text>Click Me!</Text>
        </TouchableOpacity>
      </View>
    )
  }
}