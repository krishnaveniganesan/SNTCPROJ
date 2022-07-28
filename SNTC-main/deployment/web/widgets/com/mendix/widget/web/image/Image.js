define(["exports","react","react-dom"],(function(e,t,n){"use strict";function o(e){return e&&"object"==typeof e&&"default"in e?e:{default:e}}var r=o(t),i=o(n);var a,c={exports:{}};
/*!
    Copyright (c) 2017 Jed Watson.
    Licensed under the MIT License (MIT), see
    http://jedwatson.github.io/classnames
  */a=c,function(){var e={}.hasOwnProperty;function t(){for(var n=[],o=0;o<arguments.length;o++){var r=arguments[o];if(r){var i=typeof r;if("string"===i||"number"===i)n.push(r);else if(Array.isArray(r)&&r.length){var a=t.apply(null,r);a&&n.push(a)}else if("object"===i)for(var c in r)e.call(r,c)&&r[c]&&n.push(c)}}return n.join(" ")}a.exports?(t.default=t,a.exports=t):window.classNames=t}();var s=c.exports;function l(e,t){return"pixels"===t?e:"percentage"===t?e+"%":""}function u(e){return e?{onClick:e,role:"button",tabIndex:0,onKeyDown:t=>{"Enter"!==t.key&&" "!==t.key||e(t)}}:{}}const d=function(e){return t.createElement("div",{className:s("mx-image-viewer",{"mx-image-viewer-responsive":e.responsive},e.className,{hidden:!e.hasImage})},e.children)},f=function(e){return t.createElement("div",{className:s("mx-image-viewer","mx-image-background",e.className),onClick:e.onClick,style:{...e.style,height:l(e.height,e.heightUnit),width:l(e.width,e.widthUnit),backgroundImage:"url('".concat(e.image,"')")}},e.children)},m=function(e){const n=e.altText?{"aria-label":e.altText,role:"img"}:{},o=u(e.onClick);return t.createElement("span",{className:s("glyphicon",e.icon),style:{...e.style,fontSize:"".concat(e.size,"px")},...n,...o})},p=function(e){const n=u(e.onClick);return t.createElement("img",{className:e.className,src:e.image,style:{...e.style,height:l(e.height,e.heightUnit),width:l(e.width,e.widthUnit)},alt:e.altText,...n})};function h(){return(h=Object.assign||function(e){for(var t=1;t<arguments.length;t++){var n=arguments[t];for(var o in n)Object.prototype.hasOwnProperty.call(n,o)&&(e[o]=n[o])}return e}).apply(this,arguments)}function v(e){return e&&e.ownerDocument||document}function g(e){void 0===e&&(e=v());try{var t=e.activeElement;return t&&t.nodeName?t:null}catch(t){return e.body}}function y(e,t){return e.contains?e.contains(t):e.compareDocumentPosition?e===t||!!(16&e.compareDocumentPosition(t)):void 0}var b=!("undefined"==typeof window||!window.document||!window.document.createElement),w=!1,E=!1;try{var C={get passive(){return w=!0},get once(){return E=w=!0}};b&&(window.addEventListener("test",C,C),window.removeEventListener("test",C,!0))}catch(L){}function k(e,t,n,o){return function(e,t,n,o){if(o&&"boolean"!=typeof o&&!E){var r=o.once,i=o.capture,a=n;!E&&r&&(a=n.__once||function e(o){this.removeEventListener(t,e,i),n.call(this,o)},n.__once=a),e.addEventListener(t,a,w?o:i)}e.addEventListener(t,n,o)}(e,t,n,o),function(){!function(e,t,n,o){var r=o&&"boolean"!=typeof o?o.capture:o;e.removeEventListener(t,n,r),n.__once&&e.removeEventListener(t,n.__once,r)}(e,t,n,o)}}var x={exports:{}},O={},S="function"==typeof Symbol&&Symbol.for,N=S?Symbol.for("react.element"):60103,T=S?Symbol.for("react.portal"):60106,L=S?Symbol.for("react.fragment"):60107,P=S?Symbol.for("react.strict_mode"):60108,j=S?Symbol.for("react.profiler"):60114,F=S?Symbol.for("react.provider"):60109,$=S?Symbol.for("react.context"):60110,R=S?Symbol.for("react.async_mode"):60111,D=S?Symbol.for("react.concurrent_mode"):60111,_=S?Symbol.for("react.forward_ref"):60112,I=S?Symbol.for("react.suspense"):60113,M=S?Symbol.for("react.suspense_list"):60120,U=S?Symbol.for("react.memo"):60115,A=S?Symbol.for("react.lazy"):60116,B=S?Symbol.for("react.block"):60121,z=S?Symbol.for("react.fundamental"):60117,V=S?Symbol.for("react.responder"):60118,H=S?Symbol.for("react.scope"):60119;function W(e){if("object"==typeof e&&null!==e){var t=e.$$typeof;switch(t){case N:switch(e=e.type){case R:case D:case L:case j:case P:case I:return e;default:switch(e=e&&e.$$typeof){case $:case _:case A:case U:case F:return e;default:return t}}case T:return t}}}function K(e){return W(e)===D}O.AsyncMode=R,O.ConcurrentMode=D,O.ContextConsumer=$,O.ContextProvider=F,O.Element=N,O.ForwardRef=_,O.Fragment=L,O.Lazy=A,O.Memo=U,O.Portal=T,O.Profiler=j,O.StrictMode=P,O.Suspense=I,O.isAsyncMode=function(e){return K(e)||W(e)===R},O.isConcurrentMode=K,O.isContextConsumer=function(e){return W(e)===$},O.isContextProvider=function(e){return W(e)===F},O.isElement=function(e){return"object"==typeof e&&null!==e&&e.$$typeof===N},O.isForwardRef=function(e){return W(e)===_},O.isFragment=function(e){return W(e)===L},O.isLazy=function(e){return W(e)===A},O.isMemo=function(e){return W(e)===U},O.isPortal=function(e){return W(e)===T},O.isProfiler=function(e){return W(e)===j},O.isStrictMode=function(e){return W(e)===P},O.isSuspense=function(e){return W(e)===I},O.isValidElementType=function(e){return"string"==typeof e||"function"==typeof e||e===L||e===D||e===j||e===P||e===I||e===M||"object"==typeof e&&null!==e&&(e.$$typeof===A||e.$$typeof===U||e.$$typeof===F||e.$$typeof===$||e.$$typeof===_||e.$$typeof===z||e.$$typeof===V||e.$$typeof===H||e.$$typeof===B)},O.typeOf=W;
/*
  object-assign
  (c) Sindre Sorhus
  @license MIT
  */
Object.getOwnPropertySymbols,Object.prototype.hasOwnProperty,Object.prototype.propertyIsEnumerable;!function(){try{if(!Object.assign)return!1;var e=new String("abc");if(e[5]="de","5"===Object.getOwnPropertyNames(e)[0])return!1;for(var t={},n=0;n<10;n++)t["_"+String.fromCharCode(n)]=n;if("0123456789"!==Object.getOwnPropertyNames(t).map((function(e){return t[e]})).join(""))return!1;var o={};return"abcdefghijklmnopqrst".split("").forEach((function(e){o[e]=e})),"abcdefghijklmnopqrst"===Object.keys(Object.assign({},o)).join("")}catch(e){return!1}}()||Object.assign;Function.call.bind(Object.prototype.hasOwnProperty);function q(){}function Y(){}Y.resetWarningCache=q;x.exports=function(){function e(e,t,n,o,r,i){if("SECRET_DO_NOT_PASS_THIS_OR_YOU_WILL_BE_FIRED"!==i){var a=new Error("Calling PropTypes validators directly is not supported by the `prop-types` package. Use PropTypes.checkPropTypes() to call them. Read more at http://fb.me/use-check-prop-types");throw a.name="Invariant Violation",a}}function t(){return e}e.isRequired=e;var n={array:e,bool:e,func:e,number:e,object:e,string:e,symbol:e,any:e,arrayOf:t,element:e,elementType:e,instanceOf:t,node:e,objectOf:t,oneOf:t,oneOfType:t,shape:t,exact:t,checkPropTypes:Y,resetWarningCache:q};return n.PropTypes=n,n}();var Z=x.exports;function X(e){var n,o,r=(n=e,(o=t.useRef(n)).current=n,o);t.useEffect((function(){return function(){return r.current()}}),[])}function G(e){var n=function(e){var n=t.useRef(e);return t.useEffect((function(){n.current=e}),[e]),n}(e);return t.useCallback((function(){return n.current&&n.current.apply(n,arguments)}),[n])}function J(e,t){e.classList?e.classList.add(t):function(e,t){return e.classList?!!t&&e.classList.contains(t):-1!==(" "+(e.className.baseVal||e.className)+" ").indexOf(" "+t+" ")}(e,t)||("string"==typeof e.className?e.className=e.className+" "+t:e.setAttribute("class",(e.className&&e.className.baseVal||"")+" "+t))}function Q(e,t){return e.replace(new RegExp("(^|\\s)"+t+"(?:\\s|$)","g"),"$1").replace(/\s+/g," ").replace(/^\s*|\s*$/g,"")}function ee(e,t){e.classList?e.classList.remove(t):"string"==typeof e.className?e.className=Q(e.className,t):e.setAttribute("class",Q(e.className&&e.className.baseVal||"",t))}function te(e,t){return function(e){var t=v(e);return t&&t.defaultView||window}(e).getComputedStyle(e,t)}var ne=/([A-Z])/g;var oe=/^ms-/;function re(e){return function(e){return e.replace(ne,"-$1").toLowerCase()}(e).replace(oe,"-ms-")}var ie,ae=/^((translate|rotate|scale)(X|Y|Z|3d)?|matrix(3d)?|perspective|skew(X|Y)?)$/i;function ce(e,t){var n="",o="";if("string"==typeof t)return e.style.getPropertyValue(re(t))||te(e).getPropertyValue(re(t));Object.keys(t).forEach((function(r){var i=t[r];i||0===i?!function(e){return!(!e||!ae.test(e))}(r)?n+=re(r)+": "+i+";":o+=r+"("+i+") ":e.style.removeProperty(re(r))})),o&&(n+="transform: "+o+";"),e.style.cssText+=";"+n}function se(e){return"window"in e&&e.window===e?e:"nodeType"in(t=e)&&t.nodeType===document.DOCUMENT_NODE&&e.defaultView||!1;var t}function le(e){var t;return se(e)||(t=e)&&"body"===t.tagName.toLowerCase()?function(e){var t=se(e)?v():v(e),n=se(e)||t.defaultView;return t.body.clientWidth<n.innerWidth}(e):e.scrollHeight>e.clientHeight}var ue=["template","script","style"],de=function(e,t,n){[].forEach.call(e.children,(function(e){var o,r,i;-1===t.indexOf(e)&&(r=(o=e).nodeType,i=o.tagName,1===r&&-1===ue.indexOf(i.toLowerCase()))&&n(e)}))};function fe(e,t){t&&(e?t.setAttribute("aria-hidden","true"):t.removeAttribute("aria-hidden"))}var me,pe=function(){function e(e){var t=void 0===e?{}:e,n=t.hideSiblingNodes,o=void 0===n||n,r=t.handleContainerOverflow,i=void 0===r||r;this.hideSiblingNodes=void 0,this.handleContainerOverflow=void 0,this.modals=void 0,this.containers=void 0,this.data=void 0,this.scrollbarSize=void 0,this.hideSiblingNodes=o,this.handleContainerOverflow=i,this.modals=[],this.containers=[],this.data=[],this.scrollbarSize=function(e){if((!ie&&0!==ie||e)&&b){var t=document.createElement("div");t.style.position="absolute",t.style.top="-9999px",t.style.width="50px",t.style.height="50px",t.style.overflow="scroll",document.body.appendChild(t),ie=t.offsetWidth-t.clientWidth,document.body.removeChild(t)}return ie}()}var t=e.prototype;return t.isContainerOverflowing=function(e){var t=this.data[this.containerIndexFromModal(e)];return t&&t.overflowing},t.containerIndexFromModal=function(e){return t=this.data,n=function(t){return-1!==t.modals.indexOf(e)},o=-1,t.some((function(e,t){return!!n(e,t)&&(o=t,!0)})),o;var t,n,o},t.setContainerStyle=function(e,t){var n={overflow:"hidden"};e.style={overflow:t.style.overflow,paddingRight:t.style.paddingRight},e.overflowing&&(n.paddingRight=parseInt(ce(t,"paddingRight")||"0",10)+this.scrollbarSize+"px"),ce(t,n)},t.removeContainerStyle=function(e,t){Object.assign(t.style,e.style)},t.add=function(e,t,n){var o=this.modals.indexOf(e),r=this.containers.indexOf(t);if(-1!==o)return o;if(o=this.modals.length,this.modals.push(e),this.hideSiblingNodes&&function(e,t){var n=t.dialog,o=t.backdrop;de(e,[n,o],(function(e){return fe(!0,e)}))}(t,e),-1!==r)return this.data[r].modals.push(e),o;var i={modals:[e],classes:n?n.split(/\s+/):[],overflowing:le(t)};return this.handleContainerOverflow&&this.setContainerStyle(i,t),i.classes.forEach(J.bind(null,t)),this.containers.push(t),this.data.push(i),o},t.remove=function(e){var t=this.modals.indexOf(e);if(-1!==t){var n=this.containerIndexFromModal(e),o=this.data[n],r=this.containers[n];if(o.modals.splice(o.modals.indexOf(e),1),this.modals.splice(t,1),0===o.modals.length)o.classes.forEach(ee.bind(null,r)),this.handleContainerOverflow&&this.removeContainerStyle(o,r),this.hideSiblingNodes&&function(e,t){var n=t.dialog,o=t.backdrop;de(e,[n,o],(function(e){return fe(!1,e)}))}(r,e),this.containers.splice(n,1),this.data.splice(n,1);else if(this.hideSiblingNodes){var i=o.modals[o.modals.length-1],a=i.backdrop;fe(!1,i.dialog),fe(!1,a)}}},t.isTopModal=function(e){return!!this.modals.length&&this.modals[this.modals.length-1]===e},e}(),he=function(e){var t;return"undefined"==typeof document?null:null==e?v().body:("function"==typeof e&&(e=e()),e&&"current"in e&&(e=e.current),null!=(t=e)&&t.nodeType&&e||null)};function ve(e){var n=e||(me||(me=new pe),me),o=t.useRef({dialog:null,backdrop:null});return Object.assign(o.current,{add:function(e,t){return n.add(o.current,e,t)},remove:function(){return n.remove(o.current)},isTopModal:function(){return n.isTopModal(o.current)},setDialogRef:t.useCallback((function(e){o.current.dialog=e}),[]),setBackdropRef:t.useCallback((function(e){o.current.backdrop=e}),[])})}var ge=t.forwardRef((function(e,n){var o=e.show,a=void 0!==o&&o,c=e.role,s=void 0===c?"dialog":c,l=e.className,u=e.style,d=e.children,f=e.backdrop,m=void 0===f||f,p=e.keyboard,v=void 0===p||p,w=e.onBackdropClick,E=e.onEscapeKeyDown,C=e.transition,x=e.backdropTransition,O=e.autoFocus,S=void 0===O||O,N=e.enforceFocus,T=void 0===N||N,L=e.restoreFocus,P=void 0===L||L,j=e.restoreFocusOptions,F=e.renderDialog,$=e.renderBackdrop,R=void 0===$?function(e){return r.default.createElement("div",e)}:$,D=e.manager,_=e.container,I=e.containerClassName,M=e.onShow,U=e.onHide,A=void 0===U?function(){}:U,B=e.onExit,z=e.onExited,V=e.onExiting,H=e.onEnter,W=e.onEntering,K=e.onEntered,q=function(e,t){if(null==e)return{};var n,o,r={},i=Object.keys(e);for(o=0;o<i.length;o++)n=i[o],t.indexOf(n)>=0||(r[n]=e[n]);return r}(e,["show","role","className","style","children","backdrop","keyboard","onBackdropClick","onEscapeKeyDown","transition","backdropTransition","autoFocus","enforceFocus","restoreFocus","restoreFocusOptions","renderDialog","renderBackdrop","manager","container","containerClassName","onShow","onHide","onExit","onExited","onExiting","onEnter","onEntering","onEntered"]),Y=function(e,n){var o=t.useState((function(){return he(e)})),r=o[0],i=o[1];if(!r){var a=he(e);a&&i(a)}return t.useEffect((function(){n&&r&&n(r)}),[n,r]),t.useEffect((function(){var t=he(e);t!==r&&i(t)}),[e,r]),r}(_),Z=ve(D),J=function(){var e=t.useRef(!0),n=t.useRef((function(){return e.current}));return t.useEffect((function(){return function(){e.current=!1}}),[]),n.current}(),Q=function(e){var n=t.useRef(null);return t.useEffect((function(){n.current=e})),n.current}(a),ee=t.useState(!a),te=ee[0],ne=ee[1],oe=t.useRef(null);t.useImperativeHandle(n,(function(){return Z}),[Z]),b&&!Q&&a&&(oe.current=g()),C||a||te?a&&te&&ne(!1):ne(!0);var re=G((function(){if(Z.add(Y,I),ue.current=k(document,"keydown",se),le.current=k(document,"focus",(function(){return setTimeout(ae)}),!0),M&&M(),S){var e=g(document);Z.dialog&&e&&!y(Z.dialog,e)&&(oe.current=e,Z.dialog.focus())}})),ie=G((function(){var e;(Z.remove(),null==ue.current||ue.current(),null==le.current||le.current(),P)&&(null==(e=oe.current)||null==e.focus||e.focus(j),oe.current=null)}));t.useEffect((function(){a&&Y&&re()}),[a,Y,re]),t.useEffect((function(){te&&ie()}),[te,ie]),X((function(){ie()}));var ae=G((function(){if(T&&J()&&Z.isTopModal()){var e=g();Z.dialog&&e&&!y(Z.dialog,e)&&Z.dialog.focus()}})),ce=G((function(e){e.target===e.currentTarget&&(null==w||w(e),!0===m&&A())})),se=G((function(e){v&&27===e.keyCode&&Z.isTopModal()&&(null==E||E(e),e.defaultPrevented||A())})),le=t.useRef(),ue=t.useRef(),de=C;if(!Y||!(a||de&&!te))return null;var fe=h({role:s,ref:Z.setDialogRef,"aria-modal":"dialog"===s||void 0},q,{style:u,className:l,tabIndex:-1}),me=F?F(fe):r.default.createElement("div",fe,r.default.cloneElement(d,{role:"document"}));de&&(me=r.default.createElement(de,{appear:!0,unmountOnExit:!0,in:!!a,onExit:B,onExiting:V,onExited:function(){ne(!0);for(var e=arguments.length,t=new Array(e),n=0;n<e;n++)t[n]=arguments[n];null==z||z.apply(void 0,t)},onEnter:H,onEntering:W,onEntered:K},me));var pe=null;if(m){var ge=x;pe=R({ref:Z.setBackdropRef,onClick:ce}),ge&&(pe=r.default.createElement(ge,{appear:!0,in:!!a},pe))}return r.default.createElement(r.default.Fragment,null,i.default.createPortal(r.default.createElement(r.default.Fragment,null,pe,me),Y))})),ye={show:Z.bool,container:Z.any,onShow:Z.func,onHide:Z.func,backdrop:Z.oneOfType([Z.bool,Z.oneOf(["static"])]),renderDialog:Z.func,renderBackdrop:Z.func,onEscapeKeyDown:Z.func,onBackdropClick:Z.func,containerClassName:Z.string,keyboard:Z.bool,transition:Z.elementType,backdropTransition:Z.elementType,autoFocus:Z.bool,enforceFocus:Z.bool,restoreFocus:Z.bool,restoreFocusOptions:Z.shape({preventScroll:Z.bool}),onEnter:Z.func,onEntering:Z.func,onEntered:Z.func,onExit:Z.func,onExiting:Z.func,onExited:Z.func,manager:Z.instanceOf(pe)};ge.displayName="Modal",ge.propTypes=ye;var be=Object.assign(ge,{Manager:pe});function we({onClose:e,...n}){return t.createElement("div",{className:"mx-image-viewer-lightbox-backdrop",...n},t.createElement("button",{className:s("btn btn-image btn-icon close-button"),onClick:e},t.createElement("img",{src:"data:image/svg+xml,%3Csvg%20width%3D%2232%22%20height%3D%2232%22%20viewBox%3D%220%200%2032%2032%22%20fill%3D%22none%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%3E%20%20%20%20%3Cpath%20fill-rule%3D%22evenodd%22%20clip-rule%3D%22evenodd%22%20d%3D%22M18.2222%2016.0003L26.5397%207.6828C27.1541%207.06838%2027.1541%206.07524%2026.5397%205.46082C25.9253%204.84639%2024.9321%204.84639%2024.3177%205.46082L16.0002%2013.7783L7.68279%205.46082C7.06837%204.84639%206.07524%204.84639%205.46082%205.46082C4.84639%206.07524%204.84639%207.06838%205.46082%207.6828L13.7783%2016.0003L5.46082%2024.3178C4.84639%2024.9323%204.84639%2025.9254%205.46082%2026.5398C5.76724%2026.8463%206.16952%2027.0003%206.5718%2027.0003C6.97408%2027.0003%207.37636%2026.8463%207.68279%2026.5398L16.0002%2018.2223L24.3177%2026.5398C24.6241%2026.8463%2025.0264%2027.0003%2025.4287%2027.0003C25.831%2027.0003%2026.2333%2026.8463%2026.5397%2026.5398C27.1541%2025.9254%2027.1541%2024.9323%2026.5397%2024.3178L18.2222%2016.0003Z%22%20fill%3D%22white%22%2F%3E%3C%2Fsvg%3E",className:"removeIcon",alt:"Close icon for the full screen image lightbox"})))}function Ee({isOpen:e,onClose:n,children:o}){const r=t.useCallback((e=>t.createElement(we,{onClose:n,...e})),[n]),i=t.useCallback((e=>{e.stopPropagation()}),[]);return t.createElement(be,{show:e,onHide:n,renderBackdrop:r,onBackdropClick:i,className:"mx-image-viewer-lightbox"},t.createElement("div",null,o))}function Ce(e,t){if(!e||"fullImage"===t)return e;const n=new URL(e);return n.searchParams.append("thumb","true"),n.href}const ke=({class:e,style:n,widthUnit:o,width:r,heightUnit:i,height:a,iconSize:c,responsive:l,onClickType:u,onClick:h,type:v,image:g,altText:y,displayAs:b,previewMode:w,renderAsBackground:E,backgroundImageContent:C})=>{const{lightboxIsOpen:k,openLightbox:x,closeLightbox:O}=(()=>{const[e,n]=t.useState(!1);return{lightboxIsOpen:e,openLightbox:t.useCallback((()=>{n(!0)}),[]),closeLightbox:t.useCallback((()=>{n(!1)}),[])}})(),S=t.useCallback((e=>{null==e||e.stopPropagation(),O()}),[O]),N=t.useCallback((e=>{e.stopPropagation(),"action"===u?null==h||h():"enlarge"===u&&x()}),[h,u,x]),T={style:n,onClick:"action"===u&&h||"enlarge"===u?N:void 0,altText:y},L="image"===v?t.createElement(p,{className:s({"img-thumbnail":"thumbnail"===b}),image:w?g:Ce(g,b),height:a,heightUnit:i,width:r,widthUnit:o,...T}):t.createElement(m,{icon:g,size:c,...T});return E?t.createElement(f,{className:e,style:n,image:g,height:a,heightUnit:i,width:r,widthUnit:o,onClick:e=>{e.stopPropagation(),null==h||h()}},C):t.createElement(d,{className:e,responsive:l,hasImage:void 0!==g&&g.length>0},L,!w&&k&&t.createElement(Ee,{isOpen:k,onClose:S},"image"===v?t.cloneElement(L,{image:g,onClick:void 0}):L))};e.Image=e=>{var n;const o=t.useCallback((()=>{var t;return null===(t=e.onClick)||void 0===t?void 0:t.execute()}),[e.onClick]),{type:r,image:i}=function({datasource:e,imageIcon:t,imageObject:n,imageUrl:o,defaultImageDynamic:r}){var i,a;const c={type:"image",image:void 0};switch(e){case"image":return"available"===(null==n?void 0:n.status)?{type:"image",image:n.value.uri}:"unavailable"===(null==n?void 0:n.status)&&"available"===(null==r?void 0:r.status)?{type:"image",image:r.value.uri}:{type:"image",image:void 0};case"imageUrl":return{type:"image",image:"available"===(null==o?void 0:o.status)?o.value:void 0};case"icon":if("available"===(null==t?void 0:t.status)){if("glyph"===(null===(i=t.value)||void 0===i?void 0:i.type))return{type:"icon",image:t.value.iconClass};if("image"===(null===(a=t.value)||void 0===a?void 0:a.type))return{type:"image",image:t.value.iconUrl}}return c;default:return c}}(e),a="available"===(null===(n=e.alternativeText)||void 0===n?void 0:n.status)?e.alternativeText.value:void 0;return t.createElement(ke,{class:e.class,style:e.style,widthUnit:e.widthUnit,width:e.width,heightUnit:e.heightUnit,height:e.height,iconSize:e.iconSize,responsive:e.responsive,onClickType:e.onClickType,onClick:e.onClick?o:void 0,type:r,image:i,altText:a,displayAs:e.displayAs,renderAsBackground:"icon"!==e.datasource&&e.isBackgroundImage,backgroundImageContent:e.children})},Object.defineProperty(e,"__esModule",{value:!0})}));
