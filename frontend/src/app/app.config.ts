import { ApplicationConfig, importProvidersFrom, Provider, provideZoneChangeDetection } from '@angular/core';
import { provideRouter } from '@angular/router';

import { routes } from './app.routes';
import { HttpClientModule } from '@angular/common/http';

// export const appConfig: ApplicationConfig = {
//   providers: [provideZoneChangeDetection({ eventCoalescing: true }), provideRouter(routes)]
// };

export const appConfig={
  providers:[provideRouter(routes),importProvidersFrom(HttpClientModule)]
            
};