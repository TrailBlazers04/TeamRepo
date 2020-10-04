import { TestBed } from '@angular/core/testing';

import { AddQuestionServiceService } from './add-question-service.service';

describe('AddQuestionServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AddQuestionServiceService = TestBed.get(AddQuestionServiceService);
    expect(service).toBeTruthy();
  });
});
